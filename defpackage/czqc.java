package defpackage;

import androidx.media3.ui.LegacyPlayerView;
import com.google.android.apps.messaging.R;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class czqc extends maw {
    final /* synthetic */ czqd b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czqc(czqd czqdVar, mcg mcgVar) {
        super(mcgVar);
        this.b = czqdVar;
    }

    @Override // defpackage.maw, defpackage.mcg
    public final void Q(boolean z) {
        if (z) {
            czqd czqdVar = this.b;
            LegacyPlayerView legacyPlayerView = (LegacyPlayerView) czqdVar.a.N().findViewById(R.id.exo_player);
            if (legacyPlayerView != null) {
                legacyPlayerView.c(500);
            }
            aiwl aiwlVar = czqdVar.b;
            final emza emzaVarM = czqdVar.m();
            final emyn emynVarL = czqdVar.l();
            final long j = czqdVar.j();
            aiwlVar.k(new Supplier() { // from class: aiwk
                @Override // java.util.function.Supplier
                public final Object get() {
                    return aiwl.b(emzaVarM, emynVarL, 2, j);
                }
            });
        } else {
            czqd czqdVar2 = this.b;
            final emza emzaVarM2 = czqdVar2.m();
            final emyn emynVarL2 = czqdVar2.l();
            final long j2 = czqdVar2.j();
            czqdVar2.b.k(new Supplier() { // from class: aiwh
                @Override // java.util.function.Supplier
                public final Object get() {
                    return aiwl.b(emzaVarM2, emynVarL2, 3, j2);
                }
            });
        }
        this.a.Q(z);
    }

    @Override // defpackage.maw, defpackage.mcg
    public final void d() {
        Q(false);
    }

    @Override // defpackage.maw, defpackage.mcg
    public final void e() {
        Q(true);
    }
}
