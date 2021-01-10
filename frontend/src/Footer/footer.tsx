import './footer.css';
import { ReactComponent as YoutubeIcon } from './youtube.svg'
import { ReactComponent as InstagramIcon } from './linkedin.svg'
import { ReactComponent as LinkedinIcon } from './instagram.svg'


function Footer() {
    return (
        <footer className='main-footer'>
            App desenvolvido durante a 2ª ed. do evento Semana DevSuperior
            <div className='footer-icons'>
                <a href=''><YoutubeIcon /></a>
                <a href='https://www.linkedin.com/in/thomaserickfernandes/' target='_new'><LinkedinIcon /></a>
                <a href=''><InstagramIcon /></a>
            </div>
        </footer>
    )
}


export default Footer;