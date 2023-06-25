import librosa, musicalbeeps as mb , dataset as ds

player = mb.Player(volume=0.5);

data, sample_rate = librosa.load('sound.ogg')
spectrum = librosa.stft(data)
frequencies = librosa.fft_frequencies(sr=sample_rate, n_fft=spectrum.shape[0])
freq = frequencies
print(round(freq[1],2))


for i in range(len(freq)):
    res_key, res_val = min(ds.notes.items(), key=lambda x: abs(round(freq[i],2) - x[1]))
    print(res_key, res_val, sep=', ')
    player.play_note(res_key)

