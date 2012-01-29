package org.novoj.json

import org.novoj.json.model.Photo
import org.novoj.json.model.PhotoAlbum
import org.novoj.json.model.User

/**
* No documentation needed, just look at the methods.
*
* @author Jan Novotný (novotny@fg.cz), FG Forrest a.s. (c) 2010
* @version $Id: PhotoAlbumFactory,28.1.12 21:57 u_jno Exp $
*/
class PhotoAlbumFactory {
	
	public PhotoAlbum generatePhotoAlbum(String albumName, Integer photoCount) {
		PhotoAlbum album = new PhotoAlbum(
			created: new Date(),
			modified: new Date(),
			name: albumName,
			description: "Bytů titká diditěrá kryti pěmlům něčibisk. Kupač v baďma niclí žrýť klarniská s úchlou lani v di pyni, choř buzlab něstzyř z sepě útiř ktyj z lýtěť klibřá, gler kadi dichsláčfrů zkeh. ďábru ktati plichyklu zkyvi a suď. Dětlél nitě, k myche úchu sikléšane. človeť dinišív frý děchdi z cečlaztitě i bůblátlom dlaz? řoplýz něk tá vyclí těř clubuřísk vlip ošteš tibřá a vlař. Vupi žluřír vě. Ope ošra ptuchyňo. Zrápusré bělkaš žukluru fli k úblič ti. O méper k stouďočly.",
			photoCount: photoCount,
			owner: generateUser(),
			photos: generatePhotos(photoCount)
		)		
		return album
	}

	public List<Photo> generatePhotos(Integer photoCount) {
		List<Photo> result = new ArrayList<Photo>();
		for (int i = 1; i <= photoCount; i++) {
			result.add(
				new Photo(
					name: "Photo ${i}",
					description: "Křo bikry k zrůfloř. Rodičluch s glísk, dižlot lkak ole státra o něgléc clův ťaně. Tich skýzra tkýtě ma puže pis o fysla, cloupy a řeněh čoť. Z slouniv lutři i tizyv pesoť klénělaz škoklí ži. He pěšla v vudi čloust. Titkupol vří zkamu žryl sluň hráďá botvle, šláž pešti diš diruměs titkýtká dlebrož. Blodle nich škedřeč z hřábřa bašta. Ma ktapul ťátrý a dryfr. Tlukzléš brsk. Tlábě měs s ňotlu.",
					path: "/img/galleries/12345/photo_${i}.png",
					author: generateUser(),
					created: new Date(),
					width: 4000,
					height: 3000,
					horizontal: true,
					vertical: false,
					rating: 3.67,
					ratingCount: 234,
					displayCount: 2334
				)
			)
		}
		return result;
	}

	public User generateUser() {
		return new User(
			login: "hacker",
			firstName: "Nevil",
			lastName: "Maskelyne",
			age: 149,
			email: "nevil.maskelyne@gmail.com",
			birthDate: new Date(1863, 1, 1)
		);
	}

}
