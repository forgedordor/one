package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class afkm extends fcyz implements fdat {
    final /* synthetic */ afko a;
    final /* synthetic */ MessageIdType b;
    final /* synthetic */ List c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afkm(fcxy fcxyVar, afko afkoVar, MessageIdType messageIdType, List list) {
        super(2, fcxyVar);
        this.a = afkoVar;
        this.b = messageIdType;
        this.c = list;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((afkm) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        return Boolean.valueOf(this.a.e(this.b, this.c));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        afkm afkmVar = new afkm(fcxyVar, this.a, this.b, this.c);
        afkmVar.d = obj;
        return afkmVar;
    }
}
