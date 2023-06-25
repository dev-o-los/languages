import calendar
from PIL import Image, ImageDraw, ImageFont

# Set the calendar year to be displayed
year = 2023

# Set the dimensions of the calendar image
width = 2400
height = 3500

# Set the font to be used for the calendar
font = ImageFont.truetype('FreeMono.ttf', 90)

# Iterate through each month of the year
for month in range(1, 13):
  # Create a new image for the month
  month_image = Image.new('L', (width, height), 'white')
  draw = ImageDraw.Draw(month_image)
  
  # Get the calendar for the month
  cal = calendar.monthcalendar(year, month)
  
  # Get the month name and year
  month_year = calendar.month_name[month] + ' ' + str(year)
  
  # Calculate the width of the month/year text
  month_year_width, month_year_height = draw.textsize(month_year, font=font)
  
  # Calculate the x and y positions to draw the month/year text
  x = (width - month_year_width) / 2
  y = 90
  
  # Draw the month/year text on the image
  draw.text((x, y), month_year, font=font, fill='black')
  
  # Draw the day names at the top of the calendar
  day_names = ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']
  for i in range(len(day_names)):
    x = (i * 350) + 50
    y = 350
    draw.text((x, y), day_names[i], font=font, fill='black')
  
  # Iterate through each week of the month
  for week in cal:
    # Iterate through each day of the week
    for day in week:
      # If the day is not 0 (meaning it is a day of the month), draw it on the image
      if day != 0:
        # Calculate the x and y positions to draw the day text
        x = (week.index(day) * 350) + 100
        y = (cal.index(week) * 300) + 700
        
        # Draw the day text on the image
        draw.text((x, y), str(day), font=font, fill='black')
  
  # Save the image for the month
  month_image.save(month_year + '.jpg')
