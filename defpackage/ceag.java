package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceag {
    public static final cczi a;
    private static final int b;
    private static final String c;
    private static final String d;
    private static final String e;
    private final Context f;
    private final cogw g;
    private final fcsu h;
    private final cqmp i;
    private final cmum j;
    private final cqsu k;
    private final bbfk l;
    private final cqmz m;
    private final ains n;
    private final cped o;
    private final ckww p;
    private final apth q;
    private final arwc r;
    private final axws s;

    static {
        int millis = (int) TimeUnit.SECONDS.toMillis(5L);
        b = millis;
        c = "<par dur=\"" + millis + "ms\"><img src=\"%s\" region=\"Image\" /></par>";
        d = "<par dur=\"" + millis + "ms\"><text src=\"%s\" region=\"Text\" /></par>";
        e = "<par dur=\"" + millis + "ms\"><ref src=\"%s\" /></par>";
        a = cdag.e(cdag.b, "max_image_width_height_rcs", 131072);
    }

    public ceag(Context context, cogw cogwVar, fcsu fcsuVar, cqmp cqmpVar, cmum cmumVar, cqsu cqsuVar, bbfk bbfkVar, cqmz cqmzVar, ains ainsVar, cped cpedVar, axws axwsVar, ckww ckwwVar, apth apthVar, arwc arwcVar) {
        this.f = context;
        this.g = cogwVar;
        this.h = fcsuVar;
        this.i = cqmpVar;
        this.j = cmumVar;
        this.k = cqsuVar;
        this.l = bbfkVar;
        this.m = cqmzVar;
        this.n = ainsVar;
        this.o = cpedVar;
        this.s = axwsVar;
        this.p = ckwwVar;
        this.q = apthVar;
        this.r = arwcVar;
    }

    public static String b(String str, String str2, String str3, int i, String str4) {
        if (str != null) {
            return str;
        }
        if (true == TextUtils.isEmpty(str2)) {
            str2 = str3;
        }
        return String.format(str4, Integer.valueOf(i), str2);
    }

    private final long c(ln lnVar, MessagePartCoreData messagePartCoreData, String str) throws IOException {
        Uri uriT = messagePartCoreData.t();
        if (uriT == null) {
            cqca.f("Bugle", "Null otherPart uri");
            return 0L;
        }
        String strR = messagePartCoreData.R();
        strR.getClass();
        if (cqca.q("Bugle", 2)) {
            cqca.l("Bugle", "addPart attachmentUrl: ".concat(uriT.toString()));
        }
        long jA = this.m.a(uriT);
        d(lnVar, str, uriT, strR);
        return jA;
    }

    private static void d(ln lnVar, String str, Uri uri, String str2) {
        lt ltVar = new lt();
        ltVar.e = uri;
        ltVar.h(str2.getBytes());
        e(ltVar, str);
        lnVar.d(ltVar);
    }

    private static void e(lt ltVar, String str) {
        ltVar.g(str.getBytes());
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            str = str.substring(0, iLastIndexOf);
        }
        ltVar.f(str.getBytes());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:281:0x087d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.ceah a(android.content.Context r53, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData r54, int r55) {
        /*
            Method dump skipped, instructions count: 2470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceag.a(android.content.Context, com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData, int):ceah");
    }
}
