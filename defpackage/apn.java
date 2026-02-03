package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class apn implements bkf {
    private final boolean c;
    private final String d;
    private final int e;
    private final Map f = new HashMap();
    private final bly g;

    public apn(String str, bly blyVar) throws NumberFormatException {
        int i;
        boolean z;
        this.d = str;
        try {
            i = Integer.parseInt(str);
            z = true;
        } catch (NumberFormatException unused) {
            bbs.f("Camera2EncoderProfilesProvider", a.a(str, "Camera id is not an integer: ", ", unable to create Camera2EncoderProfilesProvider"));
            i = -1;
            z = false;
        }
        this.c = z;
        this.e = i;
        this.g = blyVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022b  */
    @Override // defpackage.bkf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.bkj a(int r24) {
        /*
            Method dump skipped, instructions count: 800
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apn.a(int):bkj");
    }

    @Override // defpackage.bkf
    public final boolean b(int i) {
        return this.c && a(i) != null;
    }
}
