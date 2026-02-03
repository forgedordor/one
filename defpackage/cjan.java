package defpackage;

import com.google.android.rcs.client.messaging.MessagingResult;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjan {
    public static final augm a(MessagingResult messagingResult) {
        boolean z = messagingResult.b() == 14 || messagingResult.b() == 16;
        augl auglVar = (augl) augm.a.createBuilder();
        auglVar.copyOnWrite();
        augm augmVar = (augm) auglVar.instance;
        augmVar.b = 1 | augmVar.b;
        augmVar.c = z;
        evrj evrjVarA = evwz.a(messagingResult.c());
        auglVar.copyOnWrite();
        augm augmVar2 = (augm) auglVar.instance;
        evrjVarA.getClass();
        augmVar2.d = evrjVarA;
        augmVar2.b |= 2;
        return (augm) auglVar.build();
    }
}
