package defpackage;

import android.content.Context;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class codk implements cnpf {
    public static final /* synthetic */ int b = 0;
    private final cmfo d;
    private final cmqj e;
    private final fcsu f;
    private final Context g;
    private final codp h;
    private static final cqce c = cqce.g("Bugle", "PartTableDetectionHeuristic");
    static final cczv a = cdag.q(153021568, "restore_settings_after_bugle_wipeout");

    public codk(Context context, cmgk cmgkVar, cmqj cmqjVar, fcsu fcsuVar) {
        this.g = context;
        cmgg cmggVarC = cmgh.c();
        cmggVarC.d(cmfn.PART_WIPEOUT_HEURISTIC);
        cmggVarC.f(codm.a);
        cmfo cmfoVarA = cmgkVar.a(cmggVarC.a());
        this.d = cmfoVarA;
        this.e = cmqjVar;
        this.f = fcsuVar;
        this.h = new codp(context, cmfoVarA);
    }

    private final void b() {
        this.h.a(Uri.parse("content://mms/2047483647/part"), new codo() { // from class: codj
            @Override // defpackage.codo
            public final Object a(Object obj, Uri uri, String str) {
                int i = codk.b;
                codl codlVar = (codl) ((codm) obj).toBuilder();
                String string = uri.toString();
                codlVar.copyOnWrite();
                codm codmVar = (codm) codlVar.instance;
                string.getClass();
                codmVar.b = string;
                codlVar.copyOnWrite();
                codm codmVar2 = (codm) codlVar.instance;
                str.getClass();
                codmVar2.c = str;
                return (codm) codlVar.build();
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00ca A[Catch: all -> 0x012a, TRY_LEAVE, TryCatch #2 {all -> 0x012a, blocks: (B:12:0x007b, B:14:0x0081, B:15:0x00ca), top: B:47:0x007b, outer: #1 }] */
    @Override // defpackage.cnpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.util.Optional a() {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.codk.a():j$.util.Optional");
    }
}
