package com.example.composable.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.Visibility
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.a20octubre.ui.theme._20OctubreTheme

// Paleta de colores M3: Índigo y Gris
private val IndigoPrimary = Color(0xFF4F46E5)
private val IndigoDark = Color(0xFF3730A3)
private val IndigoLightContainer = Color(0xFFEEF2FF)
private val NeutralBackground = Color(0xFFF8FAFC)
private val NeutralSurface = Color(0xFFFFFFFF)
private val TextPrimary = Color(0xFF0F172A)
private val TextSecondary = Color(0xFF64748B)
private val BorderColor = Color(0xFFE2E8F0)

@Composable
fun RegistroScreen() {
    Scaffold(
        containerColor = NeutralBackground,
        topBar = {
            // 1. Botón de flecha hacia atrás arriba a la izquierda
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 8.dp, vertical = 8.dp)
            ) {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = "Volver",
                        tint = TextPrimary
                    )
                }
            }
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(horizontal = 24.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.Start
        ) {
            // 2. Título grande
            Text(
                text = "Crea tu cuenta",
                style = MaterialTheme.typography.headlineMedium.copy(
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,
                    color = TextPrimary
                )
            )

            Spacer(modifier = Modifier.height(6.dp))

            // 3. Subtítulo
            Text(
                text = "Empieza tu viaje con nosotros",
                style = MaterialTheme.typography.bodyLarge.copy(
                    color = TextSecondary,
                    fontSize = 16.sp
                )
            )

            Spacer(modifier = Modifier.height(28.dp))

            // 4. Campo: Nombre completo
            OutlinedTextField(
                value = "Carlos Mendoza",
                onValueChange = {},
                readOnly = true,
                label = { Text("Nombre completo") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Person,
                        contentDescription = null,
                        tint = TextSecondary
                    )
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = outlinedFieldColors()
            )

            Spacer(modifier = Modifier.height(16.dp))

            // 5. Campo: Correo electrónico
            OutlinedTextField(
                value = "carlos.mendoza@correo.com",
                onValueChange = {},
                readOnly = true,
                label = { Text("Correo electrónico") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Email,
                        contentDescription = null,
                        tint = TextSecondary
                    )
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = outlinedFieldColors()
            )

            Spacer(modifier = Modifier.height(16.dp))

            // 6. Campo: Contraseña con icono de candado y ojo
            OutlinedTextField(
                value = "miSuperPassword123",
                onValueChange = {},
                readOnly = true,
                label = { Text("Contraseña") },
                visualTransformation = PasswordVisualTransformation(),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Lock,
                        contentDescription = null,
                        tint = TextSecondary
                    )
                },
                trailingIcon = {
                    IconButton(onClick = {}) {
                        Icon(
                            imageVector = Icons.Outlined.Visibility,
                            contentDescription = "Mostrar contraseña",
                            tint = TextSecondary
                        )
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = outlinedFieldColors()
            )

            Spacer(modifier = Modifier.height(16.dp))

            // 7. Campo: Confirmar contraseña
            OutlinedTextField(
                value = "miSuperPassword123",
                onValueChange = {},
                readOnly = true,
                label = { Text("Confirmar contraseña") },
                visualTransformation = PasswordVisualTransformation(),
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Lock,
                        contentDescription = null,
                        tint = TextSecondary
                    )
                },
                modifier = Modifier.fillMaxWidth(),
                shape = RoundedCornerShape(12.dp),
                colors = outlinedFieldColors()
            )

            Spacer(modifier = Modifier.height(16.dp))

            // 8. Checkbox: "Acepto los términos y condiciones"
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Checkbox(
                    checked = true,
                    onCheckedChange = {},
                    colors = CheckboxDefaults.colors(
                        checkedColor = IndigoPrimary,
                        checkmarkColor = Color.White,
                        uncheckedColor = TextSecondary
                    )
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = buildAnnotatedString {
                        append("Acepto los ")
                        withStyle(style = SpanStyle(color = IndigoPrimary, fontWeight = FontWeight.SemiBold)) {
                            append("términos y condiciones")
                        }
                    },
                    style = MaterialTheme.typography.bodyMedium.copy(color = TextPrimary)
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // 9. Botón principal: "Crear cuenta"
            Button(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(54.dp),
                shape = RoundedCornerShape(14.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = IndigoPrimary,
                    contentColor = Color.White
                ),
                elevation = ButtonDefaults.buttonElevation(defaultElevation = 2.dp)
            ) {
                Text(
                    text = "Crear cuenta",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // 10. Separador: "O regístrate con"
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                HorizontalDivider(
                    modifier = Modifier.weight(1f),
                    color = BorderColor,
                    thickness = 1.dp
                )
                Text(
                    text = "O regístrate con",
                    modifier = Modifier.padding(horizontal = 14.dp),
                    style = MaterialTheme.typography.bodySmall.copy(color = TextSecondary)
                )
                HorizontalDivider(
                    modifier = Modifier.weight(1f),
                    color = BorderColor,
                    thickness = 1.dp
                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            // 11. Botón: "Continuar con Google"
            OutlinedButton(
                onClick = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .height(52.dp),
                shape = RoundedCornerShape(14.dp),
                border = BorderStroke(1.dp, BorderColor),
                colors = ButtonDefaults.outlinedButtonColors(
                    containerColor = NeutralSurface,
                    contentColor = TextPrimary
                )
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "G",
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = Color(0xFF4285F4)
                    )
                    Spacer(modifier = Modifier.width(10.dp))
                    Text(
                        text = "Continuar con Google",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.Medium
                    )
                }
            }

            Spacer(modifier = Modifier.height(28.dp))

            // 12. Pie: "¿Ya tienes una cuenta? Inicia sesión"
            Text(
                text = buildAnnotatedString {
                    withStyle(style = SpanStyle(color = TextSecondary)) {
                        append("¿Ya tienes una cuenta? ")
                    }
                    withStyle(style = SpanStyle(color = IndigoPrimary, fontWeight = FontWeight.Bold)) {
                        append("Inicia sesión")
                    }
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 24.dp),
                textAlign = TextAlign.Center,
                fontSize = 14.sp
            )
        }
    }
}

@Composable
private fun outlinedFieldColors() = OutlinedTextFieldDefaults.colors(
    focusedContainerColor = NeutralSurface,
    unfocusedContainerColor = NeutralSurface,
    focusedBorderColor = IndigoPrimary,
    unfocusedBorderColor = BorderColor,
    focusedLabelColor = IndigoPrimary,
    unfocusedLabelColor = TextSecondary,
    cursorColor = IndigoPrimary
)

@Preview(showBackground = true, widthDp = 390, heightDp = 844)
@Composable
private fun PreviewRegistro() {
    _20OctubreTheme {
        RegistroScreen()
    }
}
