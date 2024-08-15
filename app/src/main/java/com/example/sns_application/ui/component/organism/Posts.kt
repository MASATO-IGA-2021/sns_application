package com.example.sns_application.ui.component.organism

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.sns_application.data.entity.Post
import com.example.sns_application.ui.component.molecule.PostItem

@Composable
fun Posts(
    posts: List<Post>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(posts) { post ->
            PostItem(
                post = post,
                modifier = Modifier.fillMaxWidth(),
            )
            HorizontalDivider()
        }
    }

}