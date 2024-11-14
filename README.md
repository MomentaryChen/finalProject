![影片](https://www.youtube.com/watch?v=G5j8DeKDwIQ)

三方系統互通：使用 Android 手機、Linux 樹梅派與 Windows 伺服器實現三端互通，達成 IoT 概念，未來目標是擴展至智慧家電應用。

樹梅派：在寵物餵食機中扮演核心控制角色，執行影像推播、Socket 訊號傳送及 HMSST30 馬達控制，精準操作餵食機轉盤。

手機端 (Android)：提供 UI 介面，功能包含影像串流、傳送餵食訊號、影片存儲、餵食時間設定、提醒通知等，自動餵食資料儲存在 SQlite 資料庫。

伺服器端 (Windows)：作為溝通橋樑，負責訊號解碼與影像偵測，並使用 Haar-like 特徵分類器進行寵物影像辨識。
