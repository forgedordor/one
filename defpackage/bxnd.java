package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxnd extends bxmy {
    private final Context g;
    private final aipo h;
    private final cqxk i;

    public bxnd(Context context, aipo aipoVar, cqxk cqxkVar, ayju ayjuVar, MessagePartCoreData messagePartCoreData, bxmx bxmxVar) {
        super(messagePartCoreData, bxmxVar, ayjuVar);
        this.g = context;
        this.h = aipoVar;
        this.i = cqxkVar;
    }

    @Override // defpackage.bxmy
    protected final void a() {
        this.i.j = true;
    }

    @Override // defpackage.bxmy
    protected final boolean b() {
        eieu eieuVarK = eiiy.k("VideoResizingJob#runInBackground");
        try {
            Uri uri = this.c;
            boolean zD = false;
            if (uri == null) {
                cqca.n("Bugle", "Cannot resize video with null contentUri");
            } else {
                ainv ainvVarB = this.h.b("Bugle.Media.Attachment.Resize.Video.Duration");
                try {
                    File fileH = bxlf.h(this.b, this.g);
                    cqxk cqxkVar = this.i;
                    cqws cqwsVarI = cqwt.i();
                    ((cqwj) cqwsVarI).a = uri;
                    cqwsVarI.e(fileH);
                    long j = this.d;
                    cqwsVarI.f(j);
                    ((cqwj) cqwsVarI).b = this.e;
                    ((cqwj) cqwsVarI).c = "video/avc";
                    cczi ccziVar = bxmw.a;
                    cqwsVarI.c(((Boolean) ccziVar.e()).booleanValue());
                    cczi ccziVar2 = bxmw.b;
                    cqwsVarI.d(((Double) ccziVar2.e()).doubleValue());
                    if (cqxkVar.d(cqwsVarI.a())) {
                        ainvVarB.c();
                        zD = true;
                    } else {
                        long j2 = cqxkVar.k;
                        if (j2 > 0) {
                            fileH.delete();
                            cqws cqwsVarI2 = cqwt.i();
                            ((cqwj) cqwsVarI2).a = uri;
                            cqwsVarI2.e(fileH);
                            cqwsVarI2.f(j);
                            ((cqwj) cqwsVarI2).b = this.e;
                            ((cqwj) cqwsVarI2).c = "video/avc";
                            cqwsVarI2.b((j / j2) * 0.7200000286102295d);
                            cqwsVarI2.c(((Boolean) ccziVar.e()).booleanValue());
                            cqwsVarI2.d(((Double) ccziVar2.e()).doubleValue());
                            zD = cqxkVar.d(cqwsVarI2.a());
                        }
                    }
                } finally {
                    ainvVarB.c();
                }
            }
            eieuVarK.close();
            return zD;
        } finally {
        }
    }
}
