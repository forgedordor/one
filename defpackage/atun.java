package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class atun extends fcyz implements fdat {
    final /* synthetic */ Uri a;
    final /* synthetic */ ConversationIdType b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public atun(fcxy fcxyVar, Uri uri, ConversationIdType conversationIdType) {
        super(2, fcxyVar);
        this.a = uri;
        this.b = conversationIdType;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((atun) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        String[] strArr = botm.a;
        bote boteVar = new bote();
        boteVar.ap("updateRcsGroupIconUrl");
        Uri uri = this.a;
        boolean zF = fdbq.f(uri, Uri.EMPTY);
        Boolean.valueOf(zF).getClass();
        if (true == zF) {
            uri = null;
        }
        boteVar.P(uri);
        boteVar.am();
        return Boolean.valueOf(boteVar.f(this.b));
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        atun atunVar = new atun(fcxyVar, this.a, this.b);
        atunVar.c = obj;
        return atunVar;
    }
}
