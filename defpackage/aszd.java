package defpackage;

import android.telephony.ims.RcsContactUceCapability;
import android.telephony.ims.RcsUceAdapter;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aszd implements RcsUceAdapter.CapabilitiesCallback {
    final /* synthetic */ asze a;
    private final kog b;
    private final long c;

    public aszd(asze aszeVar, kog kogVar, long j) {
        this.a = aszeVar;
        this.b = kogVar;
        this.c = j;
    }

    public final void onCapabilitiesReceived(List list) {
        if (list.size() != 1) {
            this.b.c(new assm(String.format(Locale.US, "[Single Registration] Getting Capabilities failed: Expected 1 set but found: %d", Integer.valueOf(list.size()))));
            this.a.f(this.c);
            return;
        }
        this.b.b((RcsContactUceCapability) list.get(0));
        try {
            dewm dewmVar = this.a.f;
            long j = this.c;
            boolean zBooleanValue = ((Boolean) dewm.b.a()).booleanValue();
            RcsContactUceCapability rcsContactUceCapability = (RcsContactUceCapability) list.get(0);
            rcsContactUceCapability.getClass();
            int i = rcsContactUceCapability.getSourceType() == 1 ? 3 : 2;
            ewig ewigVar = (ewig) ewih.a.createBuilder();
            ewigVar.copyOnWrite();
            ewih ewihVar = (ewih) ewigVar.instance;
            ewihVar.b |= 1;
            ewihVar.e = j;
            ewigVar.copyOnWrite();
            ewih ewihVar2 = (ewih) ewigVar.instance;
            ewihVar2.f = 2;
            ewihVar2.b |= 2;
            ewigVar.copyOnWrite();
            ewih ewihVar3 = (ewih) ewigVar.instance;
            ewihVar3.g = 2;
            ewihVar3.b |= 4;
            ewiw ewiwVar = (ewiw) ewjd.a.createBuilder();
            ewiwVar.copyOnWrite();
            ewjd ewjdVar = (ewjd) ewiwVar.instance;
            ewjdVar.c = i - 1;
            ewjdVar.b |= 1;
            Iterable iterable = zBooleanValue ? (List) Collection.EL.stream(rcsContactUceCapability.getCapabilityTuples()).map(new Function() { // from class: dewl
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX WARN: Removed duplicated region for block: B:13:0x0038  */
                /* JADX WARN: Removed duplicated region for block: B:68:0x0113  */
                @Override // java.util.function.Function
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object apply(java.lang.Object r21) {
                    /*
                        Method dump skipped, instructions count: 464
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.dewl.apply(java.lang.Object):java.lang.Object");
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList()) : dewm.a;
            ewiwVar.copyOnWrite();
            ewjd ewjdVar2 = (ewjd) ewiwVar.instance;
            evtg evtgVar = ewjdVar2.f;
            if (!evtgVar.c()) {
                ewjdVar2.f = evsn.mutableCopy(evtgVar);
            }
            evpz.addAll(iterable, ewjdVar2.f);
            ewjd ewjdVar3 = (ewjd) ewiwVar.build();
            ewigVar.copyOnWrite();
            ewih ewihVar4 = (ewih) ewigVar.instance;
            ewjdVar3.getClass();
            ewihVar4.d = ewjdVar3;
            ewihVar4.c = 3;
            dewmVar.a((ewih) ewigVar.build());
        } catch (RuntimeException e) {
            dhja.r(new dhip("(SingleContactAdapterCallback)"), "[SR] there was an error logging the capabilities discovery id[%d] to clearcut: %s", Long.valueOf(this.c), e.getMessage());
        }
    }

    public final void onError(int i, long j) {
        boolean z = true;
        String str = String.format(Locale.US, "[Single Registration] Getting capabilities failed. Platform returned error code: %d", Integer.valueOf(i));
        if (i != 9 && i != 11 && i != 12) {
            z = false;
        }
        this.b.c(new assm(str, i, z));
        this.a.f.b(this.c, i, j);
    }

    public final void onComplete() {
    }
}
