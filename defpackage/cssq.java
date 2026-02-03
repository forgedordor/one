package defpackage;

import defpackage.cssq;
import j$.util.Collection;
import j$.util.stream.Stream;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cssq {
    static final ejxr a;
    static final cssj b;
    static final cczv c;
    static final ejxr d;
    static final ejxr e;
    public static final /* synthetic */ int f = 0;
    private static final String g;
    private static final cssi h;
    private static final cssj i;
    private static final Object j;
    private static final ejxr k;

    /* compiled from: PG */
    public interface a {
        ains ab();

        void iH();
    }

    static {
        String string = Character.toString((char) 0);
        g = string;
        cssh csshVar = (cssh) cssi.a.createBuilder();
        csshVar.copyOnWrite();
        cssi cssiVar = (cssi) csshVar.instance;
        cssiVar.b |= 1;
        cssiVar.c = "[\\u2000-\\u200A\\u1680\\u205F\\u3000]+([ \\t])";
        csshVar.copyOnWrite();
        cssi cssiVar2 = (cssi) csshVar.instance;
        cssiVar2.b |= 2;
        cssiVar2.d = "$1";
        csshVar.copyOnWrite();
        cssi.a((cssi) csshVar.instance);
        cssi cssiVar3 = (cssi) csshVar.build();
        h = cssiVar3;
        a = cdag.v("enable_replace_null_character");
        cssg cssgVar = (cssg) cssj.a.createBuilder();
        cssgVar.a(cssiVar3);
        cssj cssjVar = (cssj) cssgVar.build();
        i = cssjVar;
        cssg cssgVar2 = (cssg) cssj.a.createBuilder();
        cssgVar2.a(cssiVar3);
        cssh csshVar2 = (cssh) cssi.a.createBuilder();
        csshVar2.copyOnWrite();
        cssi cssiVar4 = (cssi) csshVar2.instance;
        string.getClass();
        cssiVar4.b |= 1;
        cssiVar4.c = string;
        csshVar2.copyOnWrite();
        cssi cssiVar5 = (cssi) csshVar2.instance;
        cssiVar5.b |= 2;
        cssiVar5.d = "";
        csshVar2.copyOnWrite();
        cssi.a((cssi) csshVar2.instance);
        cssgVar2.copyOnWrite();
        cssj cssjVar2 = (cssj) cssgVar2.instance;
        cssi cssiVar6 = (cssi) csshVar2.build();
        cssiVar6.getClass();
        cssjVar2.a();
        cssjVar2.b.add(cssiVar6);
        b = (cssj) cssgVar2.build();
        c = cdag.t(cdag.b, "text_sanitization_config", cssjVar, new dzze() { // from class: cssl
            @Override // defpackage.dzze
            public final Object a(byte[] bArr) {
                return (cssj) evsn.parseFrom(cssj.a, bArr);
            }
        });
        j = new Object();
        d = ejxx.a(new ejxr() { // from class: cssm
            @Override // defpackage.ejxr
            public final Object get() {
                int i2 = cssq.f;
                ((cssq.a) cqtf.a(cssq.a.class)).iH();
                Stream map = Collection.EL.stream(((cssj) cssq.c.e()).b).map(new cssk());
                int i3 = ekgb.d;
                return (ekgb) map.collect(ekcv.a);
            }
        });
        e = ejxx.a(new ejxr() { // from class: cssn
            @Override // defpackage.ejxr
            public final Object get() {
                int i2 = cssq.f;
                ((cssq.a) cqtf.a(cssq.a.class)).iH();
                Stream map = Collection.EL.stream(cssq.b.b).map(new cssk());
                int i3 = ekgb.d;
                return (ekgb) map.collect(ekcv.a);
            }
        });
        k = ejxx.a(new ejxr() { // from class: csso
            @Override // defpackage.ejxr
            public final Object get() {
                int i2 = cssq.f;
                return ((cssq.a) cqtf.a(cssq.a.class)).ab();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d A[Catch: all -> 0x008a, TryCatch #0 {, blocks: (B:6:0x0007, B:8:0x000f, B:10:0x0024, B:12:0x0035, B:13:0x003a, B:15:0x0040, B:16:0x004e, B:19:0x0056, B:20:0x005b, B:22:0x0065, B:23:0x0075, B:24:0x007b, B:11:0x002d), top: B:32:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r9) {
        /*
            ejxr r0 = defpackage.cssq.k
            if (r9 == 0) goto L8d
            java.lang.Object r1 = defpackage.cssq.j
            monitor-enter(r1)
            ejxr r2 = defpackage.cssq.a     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r3 = r2.get()     // Catch: java.lang.Throwable -> L8a
            if (r3 == 0) goto L2d
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L8a
            cczi r2 = (defpackage.cczi) r2     // Catch: java.lang.Throwable -> L8a
            r2.getClass()     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r2 = r2.e()     // Catch: java.lang.Throwable -> L8a
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L8a
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L8a
            if (r2 == 0) goto L2d
            ejxr r2 = defpackage.cssq.e     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L8a
            ekgb r2 = (defpackage.ekgb) r2     // Catch: java.lang.Throwable -> L8a
            goto L35
        L2d:
            ejxr r2 = defpackage.cssq.d     // Catch: java.lang.Throwable -> L8a
            java.lang.Object r2 = r2.get()     // Catch: java.lang.Throwable -> L8a
            ekgb r2 = (defpackage.ekgb) r2     // Catch: java.lang.Throwable -> L8a
        L35:
            ekqh r2 = r2.iterator()     // Catch: java.lang.Throwable -> L8a
            r3 = 0
        L3a:
            boolean r4 = r2.hasNext()     // Catch: java.lang.Throwable -> L8a
            if (r4 == 0) goto L7b
            java.lang.Object r4 = r2.next()     // Catch: java.lang.Throwable -> L8a
            cssp r4 = (defpackage.cssp) r4     // Catch: java.lang.Throwable -> L8a
            java.util.regex.Matcher r5 = r4.b()     // Catch: java.lang.Throwable -> L8a
            r5.reset(r9)     // Catch: java.lang.Throwable -> L8a
            r6 = 0
        L4e:
            boolean r7 = r5.find()     // Catch: java.lang.Throwable -> L8a
            if (r7 == 0) goto L63
            if (r6 != 0) goto L5b
            java.lang.StringBuffer r6 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L8a
            r6.<init>()     // Catch: java.lang.Throwable -> L8a
        L5b:
            java.lang.String r7 = r4.a()     // Catch: java.lang.Throwable -> L8a
            r5.appendReplacement(r6, r7)     // Catch: java.lang.Throwable -> L8a
            goto L4e
        L63:
            if (r6 == 0) goto L75
            boolean r9 = r4.c()     // Catch: java.lang.Throwable -> L8a
            r9 = r9 | r3
            java.lang.StringBuffer r3 = r5.appendTail(r6)     // Catch: java.lang.Throwable -> L8a
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L8a
            r8 = r3
            r3 = r9
            r9 = r8
        L75:
            java.lang.String r4 = ""
            r5.reset(r4)     // Catch: java.lang.Throwable -> L8a
            goto L3a
        L7b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            if (r3 == 0) goto L89
            java.lang.Object r0 = r0.get()
            ains r0 = (defpackage.ains) r0
            java.lang.String r1 = "Bugle.Text.Sanitization.Success.Count"
            r0.c(r1)
        L89:
            return r9
        L8a:
            r9 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8a
            throw r9
        L8d:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cssq.a(java.lang.String):java.lang.String");
    }
}
