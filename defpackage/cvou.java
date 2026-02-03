package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvou implements tdg {
    public final Context a;
    public final fcyh b;
    public final fdjx c;
    public final ConversationId d;
    public final cvpb e;
    public final afzc f;
    public final cpga g;
    public final fcsu h;
    public final fcsu i;
    public final tlj j;
    public final tdu k;
    private final boolean l;

    public cvou(Context context, fcyh fcyhVar, fdjx fdjxVar, ConversationId conversationId, cvpb cvpbVar, afzc afzcVar, cpga cpgaVar, fcsu fcsuVar, fcsu fcsuVar2, tlj tljVar, tdu tduVar) {
        context.getClass();
        fcyhVar.getClass();
        fdjxVar.getClass();
        conversationId.getClass();
        afzcVar.getClass();
        cpgaVar.getClass();
        fcsuVar.getClass();
        fcsuVar2.getClass();
        tljVar.getClass();
        tduVar.getClass();
        this.a = context;
        this.b = fcyhVar;
        this.c = fdjxVar;
        this.d = conversationId;
        this.e = cvpbVar;
        this.f = afzcVar;
        this.g = cpgaVar;
        this.h = fcsuVar;
        this.i = fcsuVar2;
        this.j = tljVar;
        this.k = tduVar;
        Object objE = cvow.c.e();
        objE.getClass();
        this.l = ((Boolean) objE).booleanValue();
    }

    public static final boolean c(ants antsVar) {
        String str;
        return (antsVar == null || (str = ((chos) antsVar).g.e) == null || str.length() == 0) ? false : true;
    }

    @Override // defpackage.tdg
    public final fdvc a() throws IOException {
        cvpb cvpbVar = this.e;
        eieu eieuVarA = eiiy.a("AddContactBanner2DataServiceImpl#getAddContactBanner2LoadedDataFlow");
        try {
            fdua fduaVar = new fdua(((cvph) cvpbVar).c, ((cvph) cvpbVar).d, new cvpd((cvph) cvpbVar, null));
            fczl.a(eieuVarA, null);
            return egwx.a(fdqc.b(fduaVar, this.b), this.c, new cvoq(this));
        } finally {
        }
    }

    @Override // defpackage.tdg
    public final boolean b() {
        return this.l;
    }
}
