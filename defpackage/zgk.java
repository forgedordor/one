package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zgk {
    private static final List a = fcva.g("https://youtube.com/*", "https://www.youtube.com/*", "https://fonts.gstatic.com/*", "https://googleads.g.doubleclick.net/*", "https://static.doubleclick.net/*", "https://jnn-pa.googleapis.com/*", "https://www.google.com/*", "https://i.ytimg.com/*", "https://*.ggpht.com/*", "https://redirector.googlevideo.com/*", "https://play.google.com/*", "https://*.googlevideo.com/*");

    public static final void a(final zgm zgmVar, ics icsVar, hml hmlVar, final int i) {
        int i2;
        final ics icsVar2;
        zgmVar.getClass();
        hml hmlVarC = hmlVar.c(1909075848);
        if ((i & 6) == 0) {
            i2 = (true != hmlVarC.D(zgmVar) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (((i2 | 48) & 19) == 18 && hmlVarC.I()) {
            hmlVarC.s();
            icsVar2 = icsVar;
        } else {
            String str = zgmVar.a;
            icsVar2 = ics.e;
            String strB = fdgn.b("\n      <!DOCTYPE html>\n      <html>\n          <head>\n              <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no\">\n                  <style>\n                      body { margin: 0; width:100%; height:100%; background-color:#000; }\n                      html { width:100%; height:100%; background-color:#000; }\n\n                      #ytplayer {\n                          position: absolute;\n                          top: 0;\n                          left: 0;\n                          width: 100% !important;\n                          height: 100% !important;\n                          border: 0px;\n                      }\n                  </style>\n          </head>\n          <body>\n              <!-- https://developers.google.com/youtube/player_parameters#Manual_IFrame_Embeds -->\n              <!-- Iframe width and height values does not play role for this html piece -->\n              <iframe id=\"ytplayer\" type=\"text/html\" width=\"16\" height=\"9\"\n                src=\"https://www.youtube.com/embed/" + str + "?modestbranding=1&rel=0&enablejsapi=1&autoplay=1&mute=1\"\n                sandbox=\"allow-scripts allow-same-origin\" frameborder=\"0\" allowfullscreen></iframe>\n                \n              <!-- https://developers.google.com/youtube/iframe_api_reference#Example_Video_Player_Constructors -->\n              <script type=\"text/javascript\">\n                  var tag = document.createElement('script');\n                  tag.src = \"https://www.youtube.com/iframe_api\";\n                  var firstScriptTag = document.getElementsByTagName('script')[0];\n                  firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);\n\n                  var player;\n                  function onYouTubeIframeAPIReady() {\n                      player = new YT.Player('ytplayer', {});\n                  }\n              </script>\n          </body>\n      </html>\n    ");
            hmlVarC.v(1310690006);
            hmlVarC.v(-1633490746);
            boolean zD = hmlVarC.D(strB) | hmlVarC.D(null);
            hmw hmwVar = (hmw) hmlVarC;
            Object objS = hmwVar.S();
            if (zD || objS == hmk.a) {
                objS = new dlsq(new dlrv(strB));
                hmwVar.af(objS);
            }
            hmwVar.ab();
            hmwVar.ab();
            dlsk.b((dlsq) objS, a, egq.e(icsVar2, 200.0f), false, null, null, null, null, null, null, hmlVarC, 0);
        }
        hpx hpxVarL = hmlVarC.L();
        if (hpxVarL != null) {
            hpxVarL.d = new fdat() { // from class: zgj
                @Override // defpackage.fdat
                public final Object a(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int i3 = i;
                    zgm zgmVar2 = zgmVar;
                    int iA = hpy.a(i3 | 1);
                    zgk.a(zgmVar2, icsVar2, (hml) obj, iA);
                    return fctx.a;
                }
            };
        }
    }
}
