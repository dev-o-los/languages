from requests_html import HTMLSession
from bs4 import BeautifulSoup
from selenium import webdriver

s = HTMLSession()

query: str = "naruto"

baseUrl = "https://www3.gogoanimes.fi"
srchUrl = f"https://www3.gogoanimes.fi/search.html?keyword={query}"

j = "https://www3.gogoanimes.fi/category/naruto-shippuuden-sunny-side-battle"
k = "https://gogoanime.vc/category/naruto-shippuuden-sunny-side-battle#disqus_thread"
links = set()


browser = webdriver.Chrome()
browser.get(j)

soup = BeautifulSoup(browser.page_source, features="lxml")

link = ""

a = soup.find_all("a")

for link in a:
    l = link.get("href", None)
    if j.split("/")[-1] in str(l):
        link = link.get("href", None)
    else:
        print("notfound")
    # print(link.get("href", None), link.get_text())

# print(link)
