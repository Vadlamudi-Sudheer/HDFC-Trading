const baseConfig = require('@eclipse-scout/cli/scripts/webpack-defaults');

module.exports = (env, args) => {
  args.resDirArray = ['src/main/resources/WebContent', 'node_modules/@eclipse-scout/core/res'];
  const config = baseConfig(env, args);

  config.entry = {
    'helloscout': './src/main/js/helloscout.js',
    'helloscout-theme': './src/main/js/helloscout-theme.less',
    'helloscout-theme-dark': './src/main/js/helloscout-theme-dark.less'
  };

  return config;
};
