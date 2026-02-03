package defpackage;

import android.view.View;
import android.view.Window;
import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daij implements lun {
    public final ea a;
    public Window b;
    public int c;
    public boolean d;
    public boolean e;
    private final int f;

    public daij(ea eaVar, lvc lvcVar, int i) {
        this.a = eaVar;
        this.f = i;
        lvcVar.c(this);
    }

    @Override // defpackage.lun
    public final void f(lvj lvjVar) {
        if (this.d) {
            this.b.addFlags(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
        } else {
            this.b.clearFlags(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
        }
        this.b.setNavigationBarColor(this.c);
        View decorView = this.b.getDecorView();
        if (this.e) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
        }
    }

    @Override // defpackage.lun
    public final void gG(lvj lvjVar) {
        this.b.addFlags(VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS);
        this.b.setNavigationBarColor(this.f);
        View decorView = this.b.getDecorView();
        if (this.e) {
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
        }
    }

    @Override // defpackage.lun
    public final /* synthetic */ void c(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void d(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void fh(lvj lvjVar) {
    }

    @Override // defpackage.lun
    public final /* synthetic */ void gF(lvj lvjVar) {
    }
}
