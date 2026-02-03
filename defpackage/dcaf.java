package defpackage;

import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcaf extends dbyd {
    public dcaf(dcag dcagVar, evqs evqsVar) {
        super(dcagVar);
        eyeh eyehVar = this.b;
        eyehVar.copyOnWrite();
        eyei eyeiVar = (eyei) eyehVar.instance;
        eyei eyeiVar2 = eyei.a;
        eyeiVar.b |= 2048;
        eyeiVar.f = evqsVar;
    }

    @Override // defpackage.dbyd
    public final /* bridge */ /* synthetic */ dbyd a() {
        Iterator it = ((dcag) this.a).m.iterator();
        dcaf dcafVarA = this;
        while (it.hasNext()) {
            dcafVarA = ((dcae) it.next()).a();
            if (dcafVarA == null) {
                return null;
            }
        }
        return dcafVarA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dbyd
    public final LogEventParcelable b() {
        emky emkyVar = this.d;
        if (emkyVar != null) {
            eyeh eyehVar = this.b;
            evqs byteString = emkyVar.toByteString();
            eyehVar.copyOnWrite();
            eyei eyeiVar = (eyei) eyehVar.instance;
            eyei eyeiVar2 = eyei.a;
            eyeiVar.b |= 524288;
            eyeiVar.h = byteString;
        }
        eyei eyeiVar3 = (eyei) this.b.build();
        dcag dcagVar = (dcag) this.a;
        PlayLoggerContext playLoggerContext = new PlayLoggerContext(dcagVar.j, dbya.a(dcagVar.g), this.k, this.j, e(), dcagVar.k);
        byte[] byteArray = eyeiVar3.toByteArray();
        int[] iArrF = dbya.f(this.e);
        ArrayList arrayList = this.f;
        String[] strArr = arrayList != null ? (String[]) arrayList.toArray(dbya.b) : null;
        int[] iArrF2 = dbya.f(this.g);
        ArrayList arrayList2 = this.h;
        ExperimentTokens[] experimentTokensArr = arrayList2 != null ? (ExperimentTokens[]) arrayList2.toArray(dbya.a) : null;
        Set set = this.i;
        return new LogEventParcelable(playLoggerContext, eyeiVar3, byteArray, iArrF, strArr, iArrF2, experimentTokensArr, set != null ? (String[]) set.toArray(dbya.b) : null, eyeiVar3.e);
    }

    @Override // defpackage.dbyd
    public final defn c() {
        throw null;
    }

    @Override // defpackage.dbyd
    public final ListenableFuture d(dbye dbyeVar) {
        return eork.i(dbzy.c);
    }
}
