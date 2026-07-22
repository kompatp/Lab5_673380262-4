**การรัน** 
---

mvn clean package
mvn spring-boot:run

---

**ตัวอย่างการเรียก API**
---
เลือกหมวดหมู่ที่ต้องการ ใน postman และใส่ url ดังนี้
| Method | Endpoint | Description |
| :--- | :--- | :--- |
| **GET** | `/coffees` | ดึงรายการเมนูกาแฟทั้งหมด |
| **GET** | `/coffees/{id}` | ดึงข้อมูลเมนูกาแฟตาม ID |
| **POST** | `/coffees` | เพิ่มเมนูกาแฟรายการใหม่ |
| **PUT** | `/coffees/{id}` | แก้ไขข้อมูลเมนูกาแฟตาม ID |
| **DELETE**| `/coffees/{id}` | ลบเมนูกาแฟตาม ID |
---
**get**

http://localhost:8080/coffees

---
**get by id**

http://localhost:8080/coffees/1 (เปลี่ยนเลข 1 เป็น ID ที่ต้องการ)

---
**post**

http://localhost:8080/coffees
header -> key:content-type, key:application/json
body: raw json 
และใส่ข้อมูลเป็น json

---
**put**

http://localhost:8080/coffees/1 (เปลี่ยนเลข 1 เป็น ID ที่ต้องการ)
header -> key:content-type, key:application/json
body: raw json 
และใส่ข้อมูลเป็น json

---
**delete**

http://localhost:8080/coffees/3 (เปลี่ยนเลข 1 เป็น ID ที่ต้องการ)


---

กรมภัฏ พิริยะ 673380262-4 sec.2
