package defpackage;

import android.content.Context;
import com.google.android.ims.filetransfer.http.message.FileInfo;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clep {
    public static final cqce a = cqce.g("BugleAction", "IncomingRcsFileTransferEventProcessor");
    public static final cczi b = cdag.f(cdag.b, "default_expiry_ft_metadata_update", TimeUnit.DAYS.toMillis(1));
    public final Context c;
    public final eosc d;
    public final fcsu e;
    public final cogw f;
    public final cotg g;
    public final coqe h;
    public final coun i;

    public clep(Context context, eosc eoscVar, coun counVar, fcsu fcsuVar, cogw cogwVar, cotg cotgVar, coqe coqeVar) {
        this.c = context;
        this.d = eoscVar;
        this.i = counVar;
        this.e = fcsuVar;
        this.f = cogwVar;
        this.g = cotgVar;
        this.h = coqeVar;
    }

    public static aucj a(Instant instant, FileInfo fileInfo) {
        atal atalVar = new atal();
        auci auciVar = (auci) aucj.a.createBuilder();
        aubx aubxVar = (aubx) atalVar.fH().fM(ContentType.e(fileInfo.mContentType));
        auciVar.copyOnWrite();
        aucj aucjVar = (aucj) auciVar.instance;
        aubxVar.getClass();
        aucjVar.e = aubxVar;
        aucjVar.b |= 1;
        auciVar.copyOnWrite();
        aucj aucjVar2 = (aucj) auciVar.instance;
        String str = fileInfo.mUrl;
        str.getClass();
        aucjVar2.f = str;
        evvp evvpVarB = evwz.b(instant);
        auciVar.copyOnWrite();
        aucj aucjVar3 = (aucj) auciVar.instance;
        evvpVarB.getClass();
        aucjVar3.g = evvpVarB;
        aucjVar3.b |= 2;
        int i = (int) fileInfo.mSize;
        auciVar.copyOnWrite();
        ((aucj) auciVar.instance).d = i;
        String str2 = fileInfo.mFileName;
        if (str2 == null) {
            return (aucj) auciVar.build();
        }
        auciVar.copyOnWrite();
        ((aucj) auciVar.instance).c = str2;
        return (aucj) auciVar.build();
    }
}
