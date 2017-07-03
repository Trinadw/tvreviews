package trina.com.tvreviews;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewPopulator implements CommandLineRunner {
	@Resource
	private ReviewRepository reviewRepo;

	@Resource
	private GenreRepository genreRepo;

	@Override
	public void run(String... args) throws Exception {
		Genre comedy = new Genre("comedy");
		genreRepo.save(comedy);
		Review review1 = new Review(comedy, "Arrested Development",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"March 10, 2010",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"/images/Webp.net-resizeimagearrestdev2.jpg");
		reviewRepo.save(review1);
		Review review2 = new Review(comedy, "Unbreakable Kimmy Schmidt",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"March 10, 2013",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"/images/Webp.net-resizeimagekimmy2.jpg");
		reviewRepo.save(review2);
		Genre drama = new Genre("drama");
		genreRepo.save(drama);
		Review review3 = new Review(drama, "Scandal",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"March 10, 2014",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"/images/635902125679670664-1579496363_scandal2.png");
		reviewRepo.save(review3);
		Genre reality = new Genre("reality");
		genreRepo.save(reality);
		Review review4 = new Review(reality, "The Voice",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"March 10, 2015",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"/images/Webp.net-resizeimage-voicechairs.jpg");
		reviewRepo.save(review4);
		Review review5 = new Review(reality, "Real Husbands of Hollywood",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"March 10, 2015",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"/images/Real-Husbands-of-Hollywood.jpg");
		reviewRepo.save(review5);
		Review review6 = new Review(drama, "Orange is the New Black",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"March 10, 2015",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"/images/ORANGE.png");
		reviewRepo.save(review6);
		Review review7 = new Review(drama, "Suits",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"March 10, 2015",
				"Lorem ipsum dolor sit amet, audire vituperatoribus pro ad, at facilisi pertinax nam. Sea error dicunt consectetuer ei, vel pertinax rationibus cu, primis nostrud accusamus ea has. Pri ornatus iracundia ea, decore luptatum ea pri. Quidam legendos constituto ad quo, splendide gloriatur contentiones sit ad, minim impetus cum et. Viris nonumy principes vix ne, eu mea modus quodsi.\r\n"
						+ "\r\n"
						+ "Admodum eligendi convenire et has, vocibus consequat sea eu. Nam nobis aliquip probatus ad, his harum aperiam instructior ad. Has mentitum comprehensam ad, suas viris clita no has. Cum ne sale nonumes. Tota novum ocurreret no pro, cum eruditi fastidii suavitate id, ex modus timeam qui.\r\n"
						+ "\r\n"
						+ "Quo democritum elaboraret ne, has solum inermis in. Quidam fabulas urbanitas ad his, te iudico scaevola ullamcorper sit, stet convenire cotidieque nam at. At mel malis facilisis sententiae, ei malorum maiorum sit, vidisse antiopam ex vim. Ea mea legimus pertinax persequeris. Usu posse nihil deseruisse no, ut aliquam sadipscing pro. Eam no minim denique mediocrem, dicta veniam laboramus eum id.\r\n"
						+ "\r\n"
						+ "Mel prima laudem at. Sed ut quodsi prompta facilisis, cum ad congue iisque, sit veritus docendi maluisset et. Nam id semper efficiendi, justo salutatus concludaturque ex vel. Populo melius no usu, ut nam albucius vituperata. Dolore offendit erroribus ei vel.",
				"/images/Suits.jpg");
		reviewRepo.save(review7);
		
	}

}
