#!/bin/sh

browserify http-getter.js -o bundle.js
firefox webapi.html
