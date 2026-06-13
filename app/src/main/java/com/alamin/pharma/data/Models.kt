package com.alamin.pharma.data

import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.MedicalServices
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.ChildCare
import androidx.compose.material.icons.outlined.Soap
import androidx.compose.material.icons.outlined.LocalDining
import androidx.compose.material.icons.outlined.Description

data class Category(
    val id: String,
    val nameAr: String,
    val icon: ImageVector
)

val SampleCategories = listOf(
    Category("medicine", "الأدوية", Icons.Outlined.MedicalServices),
    Category("cosmetics", "مستحضرات التجميل", Icons.Outlined.Face),
    Category("baby", "مستلزمات الأطفال", Icons.Outlined.ChildCare),
    Category("personal", "العناية الشخصية", Icons.Outlined.Soap),
    Category("vitamins", "الفيتامينات والمكملات الغذائية", Icons.Outlined.LocalDining)
)

data class Product(
    val id: String,
    val name: String,
    val priceYer: Int,
    val rating: Float = 0f,
    val imageUrl: String,
    val isNew: Boolean = false
)

val SampleProducts = listOf(
    Product(
        id = "p1",
        name = "48 قطعة من لصقات مساعدة على النوم للبالغين",
        priceYer = 6000,
        imageUrl = "https://images.unsplash.com/photo-1631549916768-4119b2e5f926?w=600"
    ),
    Product(
        id = "p2",
        name = "لصقة نوم عالية الجودة للبالغين من Ximonth",
        priceYer = 7500,
        imageUrl = "https://images.unsplash.com/photo-1584308666744-24d5c474f2ae?w=600"
    ),
    Product(
        id = "p3",
        name = "فيتامين سي 1000 مجم — 30 قرص",
        priceYer = 2500,
        rating = 4.5f,
        imageUrl = "https://images.unsplash.com/photo-1550572017-edd951b55104?w=600",
        isNew = true
    ),
    Product(
        id = "p4",
        name = "شراب السعال للأطفال 100 مل",
        priceYer = 1800,
        imageUrl = "https://images.unsplash.com/photo-1587854692152-cbe660dbde88?w=600",
        isNew = true
    )
)

data class Banner(
    val id: String,
    val titleAr: String,
    val subtitleAr: String,
    val bgHex: Long
)

val SampleBanners = listOf(
    Banner(
        "b1",
        "قريباً",
        "احصل على المكملات والأدوية العالمية بأسعار مفاجئة",
        0xFF1FBFB0
    )
)

data class ContactInfo(
    val whatsapp: String = "+967774973636",
    val whatsappRx: String = "+967784332800",
    val phone: String = "+967774973636",
    val email: String = "alaminmodern.ph@gmail.com",
    val address: String = "اليمن - إب - مدينة القاعدة",
    val facebook: String = "https://www.facebook.com/share/18BNE6VzVK/"
)
