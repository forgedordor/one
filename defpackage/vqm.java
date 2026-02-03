package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vqm extends fcyz implements fdau {
    int a;
    /* synthetic */ Object b;
    private /* synthetic */ Object c;

    public vqm(fcxy fcxyVar) {
        super(3, fcxyVar);
    }

    @Override // defpackage.fdau
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        vqm vqmVar = new vqm((fcxy) obj3);
        vqmVar.c = (fdpm) obj;
        vqmVar.b = obj2;
        return vqmVar.b(fctx.a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [fdpm, java.lang.Object] */
    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        Object next;
        anpj anpjVarI;
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            ?? r5 = this.c;
            Iterator<E> it = ((ekgb) this.b).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((ResolvedRecipient) next).g().A()) {
                    break;
                }
            }
            ResolvedRecipient resolvedRecipient = (ResolvedRecipient) next;
            fdpl fdpuVar = (resolvedRecipient == null || (anpjVarI = resolvedRecipient.i()) == null) ? new fdpu(Optional.empty()) : anov.a(anpjVarI);
            this.a = 1;
            if (fdpy.c(r5, fdpuVar, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }
}
