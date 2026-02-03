package defpackage;

import android.content.Intent;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class daoz extends fcyz implements fdat {
    int a;
    final /* synthetic */ dapa b;
    final /* synthetic */ Intent c;
    final /* synthetic */ ConversationId d;
    final /* synthetic */ String e;
    final /* synthetic */ boolean f;
    final /* synthetic */ boolean g;
    final /* synthetic */ boolean h;
    final /* synthetic */ boolean i;
    final /* synthetic */ int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public daoz(dapa dapaVar, int i, Intent intent, ConversationId conversationId, String str, boolean z, boolean z2, boolean z3, boolean z4, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = dapaVar;
        this.j = i;
        this.c = intent;
        this.d = conversationId;
        this.e = str;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((daoz) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1 || i != 2) {
            }
            fctl.b(obj);
            return null;
        }
        fctl.b(obj);
        dapa dapaVar = this.b;
        Intent intent = this.c;
        ConversationId conversationId = this.d;
        String str = this.e;
        boolean z = this.f;
        boolean z2 = this.g;
        boolean z3 = this.h;
        boolean z4 = this.i;
        this.a = 4;
        if (dapaVar.a(intent, conversationId, str, z, z2, z3, z4, this) == fcylVar) {
            return fcylVar;
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new daoz(this.b, this.j, this.c, this.d, this.e, this.f, this.g, this.h, this.i, fcxyVar);
    }
}
