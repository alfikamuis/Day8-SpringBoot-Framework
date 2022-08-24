# Day8-SpringBoot-Framework

Menampilkan "Hello World!" untuk GET, POST, PUT dan DELETE dengan endpoint /v1/messages
<img width="638" alt="get" src="https://user-images.githubusercontent.com/38674801/186434136-d514c209-56ca-446a-96db-e55a3d65abe8.png">
<img width="647" alt="post" src="https://user-images.githubusercontent.com/38674801/186434141-b5780966-0e13-4428-8884-3e540e0d0a5d.png">
<img width="646" alt="put" src="https://user-images.githubusercontent.com/38674801/186434146-cfd250b5-5b99-4728-809d-1d6f4f254638.png">
<img width="645" alt="delete" src="https://user-images.githubusercontent.com/38674801/186434129-12183d95-57b5-4f5b-a51d-cc4e1485ad73.png">

# Perbedaan GET, POST, DELETE pada endpoint
GET : Hanya melakukan request tanpa melakukan perubahan terhadap server,dapat dispesifikasikan sebagai idempotent tanpa merubah status dari aplikasi
POST : Melakukan perubahan terhadap server dengan menambah/merubah data, sehingga dapat merubah status dari aplikasi 
DELETE : Juga melakukan perubahan terhadap server dengan cara menghapus data sesuai request yang diberikan, sehingga juga merubah status dari aplikasi
