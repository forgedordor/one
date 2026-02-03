package defpackage;

import com.android.vcard.VCardConfig;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.clearcut.internal.PlayLoggerContext;
import com.google.android.gms.phenotype.ExperimentTokens;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbyk extends dbyd implements dbzs {
    public dbzz p;
    private final evuh q;

    public dbyk(dbyl dbylVar, evuh evuhVar) {
        super(dbylVar);
        this.q = evuhVar;
    }

    @Override // defpackage.dbyd
    public final /* bridge */ /* synthetic */ dbyd a() {
        Iterator it = ((dbyl) this.a).n.iterator();
        while (it.hasNext()) {
            ((dbyj) it.next()).a(this);
        }
        Iterator it2 = dcac.a().a.iterator();
        while (it2.hasNext()) {
            ((dbzr) it2.next()).a(this);
        }
        Iterator it3 = dbyl.m.iterator();
        while (it3.hasNext()) {
            ((dbyj) it3.next()).a(this);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dbyd
    public final LogEventParcelable b() {
        eyeg eyegVarB;
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
        eyeh eyehVar2 = this.b;
        evqs byteString2 = this.q.toByteString();
        eyehVar2.copyOnWrite();
        eyei eyeiVar3 = (eyei) eyehVar2.instance;
        eyei eyeiVar4 = eyei.a;
        byteString2.getClass();
        eyeiVar3.b |= 2048;
        eyeiVar3.f = byteString2;
        dbyl dbylVar = (dbyl) this.a;
        dbye dbyeVar = dbylVar.o;
        if (dbyeVar != null && (eyegVarB = dbyeVar.b()) != null) {
            eyehVar2.copyOnWrite();
            eyei eyeiVar5 = (eyei) eyehVar2.instance;
            eyeiVar5.l = eyegVarB;
            eyeiVar5.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
        }
        eyei eyeiVar6 = (eyei) eyehVar2.build();
        PlayLoggerContext playLoggerContext = new PlayLoggerContext(dbylVar.j, dbya.a(dbylVar.g), this.k, this.j, e(), dbylVar.k);
        byte[] byteArray = eyeiVar6.toByteArray();
        int[] iArrF = dbya.f(this.e);
        ArrayList arrayList = this.f;
        String[] strArr = arrayList != null ? (String[]) arrayList.toArray(dbya.b) : null;
        int[] iArrF2 = dbya.f(this.g);
        ArrayList arrayList2 = this.h;
        ExperimentTokens[] experimentTokensArr = arrayList2 != null ? (ExperimentTokens[]) arrayList2.toArray(dbya.a) : null;
        Set set = this.i;
        return new LogEventParcelable(playLoggerContext, eyeiVar6, byteArray, iArrF, strArr, iArrF2, experimentTokensArr, set != null ? (String[]) set.toArray(dbya.b) : null, eyeiVar6.e);
    }

    @Override // defpackage.dbyd
    public final defn c() {
        if (this.c) {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        this.c = true;
        return ((dbyl) this.a).h.a(this);
    }

    @Override // defpackage.dbyd
    public final ListenableFuture d(dbye dbyeVar) {
        return dbyeVar.a(new dbyg(Instant.ofEpochMilli(((eyei) this.b.instance).c)));
    }
}
