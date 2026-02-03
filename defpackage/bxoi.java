package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.rcs.client.messaging.data.ContentType;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bxoi extends bxnl {
    private static final ekrg i = ekrg.c("com/google/android/apps/messaging/shared/datamodel/resizing/v2/VideoResizingJob");
    private final Context j;
    private final aipo k;
    private final cqxk l;
    private final fcsu m;
    private final eosc n;

    public bxoi(Context context, aipo aipoVar, cqxk cqxkVar, fcsu fcsuVar, eosc eoscVar, eosc eoscVar2, bxnt bxntVar, ContentType contentType) {
        super(context, bxntVar, contentType, eoscVar);
        this.j = context;
        this.k = aipoVar;
        this.l = cqxkVar;
        this.m = fcsuVar;
        this.n = eoscVar2;
    }

    @Override // defpackage.bxnl
    protected final eiju a() {
        eiju eijuVarE;
        eieu eieuVarK = eiiy.k("VideoResizingJob#runInBackground");
        try {
            Uri uri = this.c;
            if (uri == null) {
                ekrw ekrwVarJ = i.j();
                ekrwVarJ.X(eksq.a, "BugleResizing");
                ((ekrd) ((ekrd) ekrwVarJ).h("com/google/android/apps/messaging/shared/datamodel/resizing/v2/VideoResizingJob", "runInBackgroundInTrace", 85, "VideoResizingJob.java")).q("Cannot resize video with null contentUri");
                eijuVarE = eijx.e(false);
            } else {
                ainv ainvVarB = this.k.b("Bugle.Media.Attachment.Resize.Video.Duration");
                try {
                    File fileH = bxlf.h(this.b, this.j);
                    ContentType contentType = this.e;
                    String string = contentType != null ? contentType.toString() : null;
                    long j = this.d;
                    String str = "video/avc";
                    if (j >= ((Long) bxmw.m.e()).longValue()) {
                        cqxx cqxxVar = (cqxx) this.m.b();
                        cqws cqwsVarI = cqwt.i();
                        ((cqwj) cqwsVarI).a = uri;
                        cqwsVarI.e(fileH);
                        ((cqwj) cqwsVarI).b = string;
                        String str2 = this.f;
                        if (str2 != null) {
                            str = str2;
                        }
                        ((cqwj) cqwsVarI).c = str;
                        cczi ccziVar = bxmw.c;
                        cqwsVarI.f((long) (j * ((Double) ccziVar.e()).doubleValue()));
                        cqwsVarI.c(((Boolean) bxmw.a.e()).booleanValue());
                        cqwsVarI.d(((Double) ccziVar.e()).doubleValue());
                        eijuVarE = cqxxVar.a(cqwsVarI.a()).h(new ejvr() { // from class: bxoh
                            @Override // defpackage.ejvr
                            public final Object apply(Object obj) {
                                Long l = (Long) obj;
                                boolean z = false;
                                if (l.longValue() <= this.a.d && l.longValue() > 0) {
                                    z = true;
                                }
                                return Boolean.valueOf(z);
                            }
                        }, this.n);
                    } else {
                        cqxk cqxkVar = this.l;
                        cqws cqwsVarI2 = cqwt.i();
                        ((cqwj) cqwsVarI2).a = uri;
                        cqwsVarI2.e(fileH);
                        ((cqwj) cqwsVarI2).b = string;
                        ((cqwj) cqwsVarI2).c = "video/avc";
                        cqwsVarI2.f(j);
                        cczi ccziVar2 = bxmw.a;
                        cqwsVarI2.c(((Boolean) ccziVar2.e()).booleanValue());
                        cczi ccziVar3 = bxmw.b;
                        cqwsVarI2.d(((Double) ccziVar3.e()).doubleValue());
                        if (cqxkVar.d(cqwsVarI2.a())) {
                            eijuVarE = eijx.e(true);
                        } else {
                            long j2 = cqxkVar.k;
                            if (j2 > 0) {
                                fileH.delete();
                                cqws cqwsVarI3 = cqwt.i();
                                ((cqwj) cqwsVarI3).a = uri;
                                cqwsVarI3.e(fileH);
                                ((cqwj) cqwsVarI3).b = string;
                                ((cqwj) cqwsVarI3).c = "video/avc";
                                cqwsVarI3.f(j);
                                cqwsVarI3.b((j / j2) * 0.7200000286102295d);
                                cqwsVarI3.c(((Boolean) ccziVar2.e()).booleanValue());
                                cqwsVarI3.d(((Double) ccziVar3.e()).doubleValue());
                                eijuVarE = eijx.e(Boolean.valueOf(cqxkVar.d(cqwsVarI3.a())));
                            } else {
                                eijuVarE = eijx.e(false);
                            }
                        }
                    }
                } finally {
                    ainvVarB.c();
                }
            }
            eieuVarK.close();
            return eijuVarE;
        } finally {
        }
    }

    @Override // defpackage.bxnl
    public final emki b() {
        return this.l.m.a();
    }
}
