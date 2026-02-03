package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qsi extends fcyz implements fdat {
    final /* synthetic */ qnm a;
    final /* synthetic */ Context b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qsi(qnm qnmVar, Context context, String str, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = qnmVar;
        this.b = context;
        this.c = str;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((qsi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        for (qog qogVar : this.a.c.values()) {
            qogVar.getClass();
            if (qogVar.e == null) {
                String str = qogVar.d;
                if (fdgn.t(str, "data:") && fdgn.O(str, "base64,", 0, false, 6) > 0) {
                    try {
                        String strSubstring = str.substring(fdgn.N(str, ',', 0, 6) + 1);
                        strSubstring.getClass();
                        byte[] bArrDecode = Base64.decode(strSubstring, 0);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inScaled = true;
                        options.inDensity = 160;
                        qogVar.e = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length, options);
                    } catch (IllegalArgumentException e) {
                        qws.b("data URL did not have correct base64 format.", e);
                    }
                }
            }
            Context context = this.b;
            String str2 = this.c;
            if (qogVar.e == null && str2 != null) {
                String str3 = qogVar.d;
                try {
                    InputStream inputStreamOpen = context.getAssets().open(str2 + str3);
                    inputStreamOpen.getClass();
                    try {
                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                        options2.inScaled = true;
                        options2.inDensity = 160;
                        qogVar.e = qwz.d(BitmapFactory.decodeStream(inputStreamOpen, null, options2), qogVar.a, qogVar.b);
                    } catch (IllegalArgumentException e2) {
                        qws.b("Unable to decode image.", e2);
                    }
                } catch (IOException e3) {
                    qws.b("Unable to open asset.", e3);
                }
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new qsi(this.a, this.b, this.c, fcxyVar);
    }
}
