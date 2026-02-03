package defpackage;

import android.text.TextUtils;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwvp implements ebvg {
    private final eygg a;
    private final fcsu b;
    private final ezol c;
    private final String d;

    public bwvp(eygg eyggVar, fcsu fcsuVar, ezol ezolVar, String str) {
        this.a = eyggVar;
        this.b = fcsuVar;
        this.c = ezolVar;
        this.d = str;
    }

    @Override // defpackage.ebvg
    public final void a(String str, boolean z) throws IOException {
        ezol ezolVar = this.c;
        String str2 = this.d;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        eieh eiehVarA = ((eigp) this.b.b()).a("DittoStickerFavoriteListener#onStickerPackFavoriteChanged");
        try {
            auvh.e(((axwu) this.a.b()).a(ezolVar, str2, str, z).r());
            fczl.a(eiehVarA, null);
        } finally {
        }
    }

    @Override // defpackage.ebvg
    public final void b() {
    }
}
