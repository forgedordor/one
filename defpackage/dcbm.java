package defpackage;

import com.google.android.gms.clearcut.sampler.SamplerDecisionParcelable;
import j$.util.Map;
import java.util.WeakHashMap;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcbm implements eora {
    final /* synthetic */ dcbn a;

    public dcbm(dcbn dcbnVar) {
        this.a = dcbnVar;
    }

    @Override // defpackage.eora
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        SamplerDecisionParcelable samplerDecisionParcelable = (SamplerDecisionParcelable) obj;
        WeakHashMap weakHashMap = dcbn.b;
        synchronized (weakHashMap) {
            Map.EL.putIfAbsent(weakHashMap, Integer.valueOf(this.a.c.hashCode()), samplerDecisionParcelable);
        }
    }

    @Override // defpackage.eora
    public final void hi(Throwable th) {
    }
}
