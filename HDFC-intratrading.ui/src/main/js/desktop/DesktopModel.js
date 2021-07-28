export default () => ({
  id: 'helloscout.Desktop',
  title: '${textKey:ApplicationTitle}',
  objectType: 'Desktop',
  logoUrl: 'img/eclipse_scout_logo.png',
  outline: {
    objectType: 'helloscout.DataOutline'
  },
  menus: [
    {
      id: 'ThemeMenu',
      objectType: 'Menu',
      text: '${textKey:Theme}',
      childActions: [
        {
          id: 'DefaultThemeMenu',
          objectType: 'Menu',
          text: 'Default'
        },
        {
          id: 'DarkThemeMenu',
          objectType: 'Menu',
          text: 'Dark'
        }
      ]
    },
    {
      id: 'AboutMenu',
      objectType: 'Menu',
      text: '${textKey:About}',
      cssClass: 'about-menu'
    }
  ]
});
