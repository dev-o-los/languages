import requests
from tqdm import tqdm

path = "D:/Anime/"
list = []
d = "https://anihdplay.com/streaming.php?id=MTgzODk5&amp;title=Tate+no+Yuusha+no+Nariagari+Season+2+Episode+1"
y = "https://gogodownload.net/download.php?url="
l = "aHR0cHM6LyAdeqwrwedffryretgsdFrsftrsvfsfsr9mYm5sbmURASDGHUSRFSJGYfdsffsderFStewthsfSFtrftesdfVrYmN4LmdvY2RuYW5pLmNvbS91c2VyMTM0Mi9mNjM4YzBmMTMwMWFjMzg4NjgyZTU0Y2QzMzlmOWVhZC9FUC4xLnYwLjcyMHAubXA0P3Rva2VuPU1BRWY1S2VBamIzZEtTSTZXR2U0UUEmZXhwaXJlcz0xNjgxNDY5MjA4JmlkPTE4Mzg5OQ=="


g = requests.get(d)


def download(url: str, fname: str, chunk_size=1024):
    resp = requests.get(url, stream=True)
    total = int(resp.headers.get("content-length", 0))
    with open(fname, "wb") as file, tqdm(
        desc=fname,
        total=total,
        unit="iB",
        unit_scale=True,
        unit_divisor=1024,
    ) as bar:
        for data in resp.iter_content(chunk_size=chunk_size):
            size = file.write(data)
            bar.update(size)


print(g)
# download(y + l, f"{path}episode{13}.mp4")
