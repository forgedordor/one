package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwss {
    public static final bwss a;
    public static final bwss b;
    public static final bwss c;
    private static final /* synthetic */ bwss[] d;

    static {
        bwss bwssVar = new bwss("ONE_ON_ONE_TEXT", 0);
        a = bwssVar;
        bwss bwssVar2 = new bwss("ONE_ON_ONE_RCS", 1);
        b = bwssVar2;
        bwss bwssVar3 = new bwss("ONE_ON_ONE_E2EE", 2);
        c = bwssVar3;
        bwss[] bwssVarArr = {bwssVar, bwssVar2, bwssVar3};
        d = bwssVarArr;
        fczb.a(bwssVarArr);
    }

    private bwss(String str, int i) {
    }

    public static final bwss a(MessageCoreData messageCoreData) {
        messageCoreData.getClass();
        return (messageCoreData.cX() && messageCoreData.cB()) ? c : messageCoreData.cX() ? b : a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.bwss b(int r3) {
        /*
            r0 = 219(0xdb, float:3.07E-43)
            if (r3 == r0) goto L1e
            switch(r3) {
                case 214: goto L1b;
                case 215: goto L18;
                case 216: goto L1e;
                default: goto L7;
            }
        L7:
            switch(r3) {
                case 235: goto L1e;
                case 236: goto L1b;
                case 237: goto L1e;
                case 238: goto L18;
                default: goto La;
            }
        La:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported status("
            java.lang.String r2 = ")"
            java.lang.String r3 = defpackage.a.e(r3, r1, r2)
            r0.<init>(r3)
            throw r0
        L18:
            bwss r3 = defpackage.bwss.b
            return r3
        L1b:
            bwss r3 = defpackage.bwss.a
            return r3
        L1e:
            bwss r3 = defpackage.bwss.c
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bwss.b(int):bwss");
    }

    public static bwss[] values() {
        return (bwss[]) d.clone();
    }
}
