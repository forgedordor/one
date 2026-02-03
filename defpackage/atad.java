package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;

/* compiled from: PG */
/* loaded from: classes6.dex */
abstract class atad extends ejvj {
    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        FileInformation fileInformation = (FileInformation) obj;
        auci auciVar = (auci) aucj.a.createBuilder();
        if (fileInformation.h().isPresent() && fileInformation.h().isPresent()) {
            String str = (String) fileInformation.h().get();
            auciVar.copyOnWrite();
            ((aucj) auciVar.instance).c = str;
        }
        int iA = fileInformation.a();
        auciVar.copyOnWrite();
        ((aucj) auciVar.instance).d = iA;
        aubx aubxVar = (aubx) atam.a.fH().fM(fileInformation.b());
        auciVar.copyOnWrite();
        aucj aucjVar = (aucj) auciVar.instance;
        aubxVar.getClass();
        aucjVar.e = aubxVar;
        aucjVar.b |= 1;
        String strI = fileInformation.i();
        auciVar.copyOnWrite();
        ((aucj) auciVar.instance).f = strI;
        c(fileInformation, auciVar);
        return (aucj) auciVar.build();
    }

    @Override // defpackage.ejvj
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        aucj aucjVar = (aucj) obj;
        efhj efhjVar = new efhj();
        d(aucjVar, efhjVar);
        efhjVar.f(aucjVar.d);
        if ((aucjVar.b & 1) != 0) {
            ejvj ejvjVar = atam.a;
            aubx aubxVar = aucjVar.e;
            if (aubxVar == null) {
                aubxVar = aubx.a;
            }
            efhjVar.c((ContentType) ejvjVar.fM(aubxVar));
        }
        efhjVar.g(aucjVar.f);
        if ((aucjVar.b & 2) != 0) {
            e(aucjVar, efhjVar);
        }
        return efhjVar.i();
    }

    public abstract void c(FileInformation fileInformation, auci auciVar);

    public void d(aucj aucjVar, efir efirVar) {
        throw null;
    }

    public abstract void e(aucj aucjVar, efir efirVar);
}
