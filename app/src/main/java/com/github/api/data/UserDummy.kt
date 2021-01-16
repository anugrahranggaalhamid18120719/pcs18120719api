package com.github.api.data

object UserDummy {
    val list: ArrayList<User>
    get(){
        val list =  arrayListOf<User>()

        list.add(User(
            "sidiqpermana",
            "https://avatars1.githubusercontent.com/u/4090245?v=4",
            "https://github.com/sidiqpermana",
            "https://api.github.com/users/sidiqpermana/followers",
            10,
            "https://api.github.com/users/sidiqpermana/following{/other_user}",
            15,
            "https://api.github.com/users/sidiqpermana/repos",
            10
        ))

        list.add(User(
            "sidiqpermana2",
            "https://avatars1.githubusercontent.com/u/4090245?v=4",
            "https://github.com/sidiqpermana",
            "https://api.github.com/users/sidiqpermana/followers",
            10,
            "https://api.github.com/users/sidiqpermana/following{/other_user}",
            15,
            "https://api.github.com/users/sidiqpermana/repos",
            10
        ))

        list.add(User(
            "sidiqpermana3",
            "https://avatars1.githubusercontent.com/u/4090245?v=4",
            "https://github.com/sidiqpermana",
            "https://api.github.com/users/sidiqpermana/followers",
            10,
            "https://api.github.com/users/sidiqpermana/following{/other_user}",
            15,
            "https://api.github.com/users/sidiqpermana/repos",
            10
        ))

        list.add(User(
            "sidiqpermana4",
            "https://avatars1.githubusercontent.com/u/4090245?v=4",
            "https://github.com/sidiqpermana",
            "https://api.github.com/users/sidiqpermana/followers",
            10,
            "https://api.github.com/users/sidiqpermana/following{/other_user}",
            15,
            "https://api.github.com/users/sidiqpermana/repos",
            10
        ))

        list.add(User(
            "sidiqpermana5",
            "https://avatars1.githubusercontent.com/u/4090245?v=4",
            "https://github.com/sidiqpermana",
            "https://api.github.com/users/sidiqpermana/followers",
            10,
            "https://api.github.com/users/sidiqpermana/following{/other_user}",
            15,
            "https://api.github.com/users/sidiqpermana/repos",
            10
        ))

        return list
    }
}