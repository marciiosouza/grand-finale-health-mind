package br.com.fiap.healfmind.components

import android.service.autofill.OnClickAction
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import br.com.fiap.healfmind.R
import br.com.fiap.healfmind.model.Meditacao
import br.com.fiap.healfmind.screens.VideoPlayerScreen
import br.com.fiap.healfmind.service.RetrofitFactory
import coil.compose.AsyncImage
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


@Composable
fun MeditacoesItem(meditacao: Meditacao , navController: NavController, modifier: Modifier) {
    Surface(
        shape = RoundedCornerShape(10.dp),
        shadowElevation = 4.dp
    ) {
        Column(
            modifier
            ) {
            Box() {
//                    Image(painter = painterResource(id = meditacao.url), contentDescription = null )
                AsyncImage(
                    model = meditacao.caminhoArquivo,
                    contentDescription = null,
                    Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                    ,
                    contentScale = ContentScale.FillBounds,
                    placeholder = painterResource(id = R.drawable.ic_launcher_background)
                )

            }
        }

    }

}




//@Preview()
//@Composable
//fun MeditacoesItemPreview(){
//
//    MeditacoesItem(
//        meditacao = Meditacao(
//            1,
//            "teste",
//            "http://pt.hdwall365.com/wallpapers/1512/Winter-sunrise-lake-ice-snow-beautiful-scenery_1280x1024_wallpaper.jpg"
//        ),
//        navController = rememberNavController(),
//        modifier = Modifier
//    )
//}

