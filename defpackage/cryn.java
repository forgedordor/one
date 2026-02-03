package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cryn extends fcyz implements fdat {
    final /* synthetic */ cryo a;
    final /* synthetic */ ParticipantsTable.BindData b;
    final /* synthetic */ ConversationIdType c;
    final /* synthetic */ csnx d;
    final /* synthetic */ eofr e;
    final /* synthetic */ eofg f;
    final /* synthetic */ int g;
    final /* synthetic */ int h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cryn(cryo cryoVar, ParticipantsTable.BindData bindData, ConversationIdType conversationIdType, csnx csnxVar, eofr eofrVar, int i, int i2, int i3, eofg eofgVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cryoVar;
        this.b = bindData;
        this.c = conversationIdType;
        this.d = csnxVar;
        this.e = eofrVar;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.f = eofgVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cryn) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        cryo cryoVar = this.a;
        cryl crylVarB = ((cryk) cryoVar.a.b()).b(this.b, null);
        eofr eofrVar = this.e;
        int i = this.g;
        int i2 = this.h;
        cryoVar.a(this.c, this.d, crylVarB, eofrVar, i, i2, this.i, this.f);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cryn(this.a, this.b, this.c, this.d, this.e, this.g, this.h, this.i, this.f, fcxyVar);
    }
}
