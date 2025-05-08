package br.senai.sp.jandira.projetoprofile.screens

import android.provider.ContactsContract.Profile
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Groups
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PersonAdd
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Whatsapp
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.projetoprofile.R
import br.senai.sp.jandira.projetoprofile.ui.theme.ProjetoProfileTheme


@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xA9FAFAFA))
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(280.dp),
            shape = RoundedCornerShape(bottomStart = 24.dp, bottomEnd = 24.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.background),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.matchParentSize()
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 40.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.profile),
                        contentDescription = null,
                        modifier = Modifier
                            .size(80.dp)
                            .clip(CircleShape)
                            .background(Color.White, CircleShape)
                    )

                    Spacer(modifier = Modifier.height(12.dp))

                    Text(
                        "Matheus Bueno",
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        "Sr. UI/UX Designer",
                        color = Color.White.copy(alpha = 0.8f),
                        fontSize = 16.sp
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    // Ações representadas por ícones estáticos
                    Row(
                        horizontalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                    ) {
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(48.dp)
                                    .clip(CircleShape)
                                    .background(Color.White.copy(alpha = 0.25f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    Icons.Default.Email,
                                    contentDescription = "Email",
                                    tint = Color.White
                                )
                            }
                            Spacer(
                                modifier = Modifier
                                    .height(4.dp)
                            )
                            Text(
                                "Email",
                                color = Color.White,
                                fontSize = 12.sp)
                        }

                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Box(
                                modifier = Modifier
                                    .size(48.dp)
                                    .clip(CircleShape)
                                    .background(Color.White.copy(alpha = 0.25f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    Icons.Default.Phone,
                                    contentDescription = "Call",
                                    tint = Color.White
                                )
                            }
                            Spacer(
                                modifier = Modifier
                                    .height(4.dp)
                            )
                            Text(
                                "Call",
                                color = Color.White,
                                fontSize = 12.sp)
                        }

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(48.dp)
                                    .clip(CircleShape)
                                    .background(Color.White.copy(alpha = 0.25f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    Icons.Default.Whatsapp,
                                    contentDescription = "Whatsapp",
                                    tint = Color.White)
                            }
                            Spacer(
                                modifier = Modifier
                                    .height(4.dp)
                            )
                            Text(
                                "Whatsapp",
                                color = Color.White,
                                fontSize = 12.sp
                            )
                        }

                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Box(
                                modifier = Modifier
                                    .size(48.dp)
                                    .clip(CircleShape)
                                    .background(Color.White.copy(alpha = 0.25f)),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    Icons.Default.Star,
                                    contentDescription = "Favorite",
                                    tint = Color.White)
                            }
                            Spacer(
                                modifier = Modifier
                                    .height(4.dp)
                            )
                            Text(
                                "Favorite",
                                color = Color.White,
                                fontSize = 12.sp
                            )
                        }
                    }

                }
            }

        }

        Spacer(modifier = Modifier.height(16.dp))

        Column(modifier = Modifier.padding(horizontal = 20.dp)) {

            Column(modifier = Modifier.padding(vertical = 8.dp)) {
                Row {
                    Icon(
                        Icons.Default.Email,
                        contentDescription = "Email",
                        tint = Color(0xFF030303)
                    )
                    Text(
                        "Email",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        color = Color.Black
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    "michael.mitc@example.com",
                    fontSize = 14.sp,
                    color = Color.DarkGray
                )
            }

            HorizontalDivider(color = Color(0xFF000000), thickness = 1.dp)

            Column(modifier = Modifier.padding(vertical = 8.dp)) {
                Row {
                    Icon(
                        Icons.Default.Phone,
                        contentDescription = "Email",
                        tint = Color(0xFF000000)
                    )
                    Text(
                        "Phone number",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        color = Color.Black
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    "(209) 555-0104",
                    fontSize = 14.sp,
                    color = Color.DarkGray
                )
            }

            HorizontalDivider(color = Color(0xFF000000), thickness = 1.dp)

            Column(modifier = Modifier.padding(vertical = 8.dp)) {
                Row {
                    Icon(
                        Icons.Default.Groups,
                        contentDescription = "Email",
                        tint = Color(0xFF000000)
                    )
                    Text(
                        "Team",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        color = Color.Black
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    "Project Operation Team",
                    fontSize = 14.sp,
                    color = Color.DarkGray
                )
            }

            HorizontalDivider(color = Color(0xFF000000), thickness = 1.dp)

            Column(modifier = Modifier.padding(vertical = 8.dp)) {
                Row {
                    Icon(
                        Icons.Default.Person,
                        contentDescription = "Email",
                        tint = Color(0xFF000000)
                    )
                    Text(
                        "Leads by",
                        fontWeight = FontWeight.Bold,
                        fontSize = 14.sp,
                        color = Color.Black
                    )
                }

                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    "Darrell Steward",
                    fontSize = 14.sp,
                    color = Color.DarkGray
                )
            }
            HorizontalDivider(color = Color(0xFF000000), thickness = 1.dp)
        }

        Spacer(modifier = Modifier.height(24.dp))

        Row(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = {},
                modifier = Modifier
                    .height(80.dp),
                colors = ButtonDefaults.buttonColors(
                    Color.White
                )
            ) {
                Row(
                    modifier = Modifier
                        .padding(horizontal = 2.dp, vertical = 2.dp)
                )  {
                    Icon(
                        Icons.Default.PersonAdd,
                        contentDescription = null,
                        tint = Color(0xFF000000)
                    )
                    Spacer(modifier = Modifier.width(15.dp))
                    Text(
                        "Add to contacts",
                        color =  Color(0xFF000000),
                        fontWeight = FontWeight.Medium
                    )
                }

            }

            IconButton(
                onClick = {},
                colors = IconButtonDefaults.iconButtonColors(
                    Color(0x7AFFFFFF)
                )
            ){
                Icon(
                    Icons.Default.Share,
                    contentDescription = null,
                    tint = Color(0xFF544C31)
                )
            }


        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun ProfileScreenPreview() {
    ProjetoProfileTheme {
        ProfileScreen()
    }
}