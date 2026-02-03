package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ecqv {
    private final Context a;
    private final String b;
    private final exqw c;

    public ecqv(Context context, String str, exqw exqwVar) {
        this.a = context;
        this.b = str;
        this.c = exqwVar;
    }

    public final void a(ecqp ecqpVar, boolean z) {
        expf expfVar;
        ecro ecroVarA = ecqc.a.d.a(this.a, this.b, ecqpVar.b, ejwk.b(ecqpVar.f));
        exoj exojVar = (exoj) expg.a.createBuilder();
        long epochMilli = Instant.now().toEpochMilli() - ecqpVar.d;
        long seconds = TimeUnit.MILLISECONDS.toSeconds(epochMilli);
        long nanos = TimeUnit.MILLISECONDS.toNanos(epochMilli - (TimeUnit.SECONDS.toMillis(1L) * seconds));
        evri evriVar = (evri) evrj.a.createBuilder();
        evriVar.copyOnWrite();
        ((evrj) evriVar.instance).b = seconds;
        evriVar.copyOnWrite();
        ((evrj) evriVar.instance).c = (int) nanos;
        evrj evrjVar = (evrj) evriVar.build();
        exojVar.copyOnWrite();
        expg expgVar = (expg) exojVar.instance;
        evrjVar.getClass();
        expgVar.e = evrjVar;
        expgVar.b |= 1;
        int i = ecqpVar.g;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 1) {
            if (((ecqu) ecqg.a.e.get(this.c.b)) == ecqu.EMBEDDED) {
                expe expeVar = (expe) expf.a.createBuilder();
                expeVar.copyOnWrite();
                expf expfVar2 = (expf) expeVar.instance;
                expfVar2.c = 1;
                expfVar2.b |= 1;
                expfVar = (expf) expeVar.build();
            } else {
                expfVar = expf.a;
            }
            exojVar.copyOnWrite();
            expg expgVar2 = (expg) exojVar.instance;
            expfVar.getClass();
            expgVar2.d = expfVar;
            expgVar2.c = 2;
        } else if (i2 == 2) {
            expa expaVar = (expa) expb.a.createBuilder();
            expy expyVar = ecqpVar.c;
            if (expyVar != null) {
                if (!z) {
                    expt exptVar = (expt) expyVar.toBuilder();
                    exptVar.copyOnWrite();
                    expy expyVar2 = (expy) exptVar.instance;
                    expyVar2.c = null;
                    expyVar2.b &= -2;
                    expyVar = (expy) exptVar.build();
                }
                expaVar.copyOnWrite();
                expb expbVar = (expb) expaVar.instance;
                expyVar.getClass();
                expbVar.c = expyVar;
                expbVar.b |= 2;
            }
            expb expbVar2 = (expb) expaVar.build();
            exojVar.copyOnWrite();
            expg expgVar3 = (expg) exojVar.instance;
            expbVar2.getClass();
            expgVar3.d = expbVar2;
            expgVar3.c = 3;
        } else if (i2 == 3) {
            exok exokVar = (exok) exol.a.createBuilder();
            boolean z2 = ecqpVar.e;
            exokVar.copyOnWrite();
            ((exol) exokVar.instance).b = z2;
            exol exolVar = (exol) exokVar.build();
            exojVar.copyOnWrite();
            expg expgVar4 = (expg) exojVar.instance;
            exolVar.getClass();
            expgVar4.d = exolVar;
            expgVar4.c = 4;
        } else if (i2 == 4) {
            exoz exozVar = ecqpVar.a;
            exojVar.copyOnWrite();
            expg expgVar5 = (expg) exojVar.instance;
            exozVar.getClass();
            expgVar5.d = exozVar;
            expgVar5.c = 5;
        } else if (i2 != 5) {
            Log.e("SurveyAnswerTransmitter", "Invalid survey answer type specified.");
        } else {
            expd expdVar = expd.a;
            exojVar.copyOnWrite();
            expg expgVar6 = (expg) exojVar.instance;
            expdVar.getClass();
            expgVar6.d = expdVar;
            expgVar6.c = 6;
        }
        exqw exqwVar = this.c;
        long j = ecse.a;
        if (exqwVar == null || exqwVar.b.isEmpty() || exqwVar.c.H()) {
            Log.e("SurveyAnswerTransmitter", "Session is invalid, dropping event.");
        } else {
            exmz exmzVar = (exmz) exna.a.createBuilder();
            exmzVar.copyOnWrite();
            exna exnaVar = (exna) exmzVar.instance;
            exnaVar.d = exqwVar;
            exnaVar.b |= 2;
            expg expgVar7 = (expg) exojVar.build();
            exmzVar.copyOnWrite();
            exna exnaVar2 = (exna) exmzVar.instance;
            expgVar7.getClass();
            exnaVar2.c = expgVar7;
            exnaVar2.b |= 1;
            final exna exnaVar3 = (exna) exmzVar.build();
            final ecsc ecscVar = new ecsc();
            if (exnaVar3 == null) {
                Log.e("NetworkCallerGrpc", "Survey record event request was null");
            } else {
                final ecrh ecrhVar = (ecrh) ecroVarA;
                ecqx.a().execute(new Runnable() { // from class: ecqz
                    @Override // java.lang.Runnable
                    public final void run() {
                        ListenableFuture listenableFutureA;
                        ListenableFuture listenableFutureA2;
                        ecrh ecrhVar2 = ecrhVar;
                        ejbe ejbeVarA = ecrhVar2.a();
                        fbnd fbndVarB = ecrhVar2.b(ejbeVarA);
                        if (fbndVarB == null) {
                            Log.e("NetworkCallerGrpc", "Could not get channel for recordEvent.");
                            return;
                        }
                        ecsc ecscVar2 = ecscVar;
                        exna exnaVar4 = exnaVar3;
                        if (!ecqc.a.b) {
                            if (ejbeVarA != null) {
                                exri exriVar = (exri) exrj.a(fbndVarB).i(new fbtx(ejbeVarA));
                                fbnd fbndVar = exriVar.a;
                                fbrk fbrkVarA = exrj.c;
                                if (fbrkVarA == null) {
                                    synchronized (exrj.class) {
                                        fbrkVarA = exrj.c;
                                        if (fbrkVarA == null) {
                                            fbrh fbrhVarA = fbrk.a();
                                            fbrhVarA.c = fbrj.UNARY;
                                            fbrhVarA.d = fbrk.c("scone.v1.SurveyService", "RecordEvent");
                                            fbrhVarA.b();
                                            exna exnaVar5 = exna.a;
                                            evrr evrrVar = fcrj.a;
                                            fbrhVarA.a = new fcrh(exnaVar5);
                                            fbrhVarA.b = new fcrh(exnc.a);
                                            fbrkVarA = fbrhVarA.a();
                                            exrj.c = fbrkVarA;
                                        }
                                    }
                                }
                                listenableFutureA2 = fcrw.a(fbndVar.a(fbrkVarA, exriVar.b), exnaVar4);
                            } else {
                                exri exriVarA = exrj.a(fbndVarB);
                                fbnd fbndVar2 = exriVarA.a;
                                fbrk fbrkVarA2 = exrj.d;
                                if (fbrkVarA2 == null) {
                                    synchronized (exrj.class) {
                                        fbrkVarA2 = exrj.d;
                                        if (fbrkVarA2 == null) {
                                            fbrh fbrhVarA2 = fbrk.a();
                                            fbrhVarA2.c = fbrj.UNARY;
                                            fbrhVarA2.d = fbrk.c("scone.v1.SurveyService", "RecordEventAnonymous");
                                            fbrhVarA2.b();
                                            exna exnaVar6 = exna.a;
                                            evrr evrrVar2 = fcrj.a;
                                            fbrhVarA2.a = new fcrh(exnaVar6);
                                            fbrhVarA2.b = new fcrh(exnc.a);
                                            fbrkVarA2 = fbrhVarA2.a();
                                            exrj.d = fbrkVarA2;
                                        }
                                    }
                                }
                                listenableFutureA2 = fcrw.a(fbndVar2.a(fbrkVarA2, exriVarA.b), exnaVar4);
                            }
                            eork.r(listenableFutureA2, new ecrc(ecrhVar2, exnaVar4, ecscVar2), ecqx.a());
                            return;
                        }
                        try {
                            faem faemVar = (faem) evsn.parseFrom(faem.a, exnaVar4.toByteString(), evrr.a());
                            if (ejbeVarA != null) {
                                faew faewVar = (faew) faex.a(fbndVarB).i(new fbtx(ejbeVarA));
                                fbnd fbndVar3 = faewVar.a;
                                fbrk fbrkVarA3 = faex.c;
                                if (fbrkVarA3 == null) {
                                    synchronized (faex.class) {
                                        fbrkVarA3 = faex.c;
                                        if (fbrkVarA3 == null) {
                                            fbrh fbrhVarA3 = fbrk.a();
                                            fbrhVarA3.c = fbrj.UNARY;
                                            fbrhVarA3.d = fbrk.c("google.internal.feedback.v1.SurveyService", "RecordEvent");
                                            fbrhVarA3.b();
                                            faem faemVar2 = faem.a;
                                            evrr evrrVar3 = fcrj.a;
                                            fbrhVarA3.a = new fcrh(faemVar2);
                                            fbrhVarA3.b = new fcrh(faeo.a);
                                            fbrkVarA3 = fbrhVarA3.a();
                                            faex.c = fbrkVarA3;
                                        }
                                    }
                                }
                                listenableFutureA = fcrw.a(fbndVar3.a(fbrkVarA3, faewVar.b), faemVar);
                            } else {
                                faew faewVarA = faex.a(fbndVarB);
                                fbnd fbndVar4 = faewVarA.a;
                                fbrk fbrkVarA4 = faex.d;
                                if (fbrkVarA4 == null) {
                                    synchronized (faex.class) {
                                        fbrkVarA4 = faex.d;
                                        if (fbrkVarA4 == null) {
                                            fbrh fbrhVarA4 = fbrk.a();
                                            fbrhVarA4.c = fbrj.UNARY;
                                            fbrhVarA4.d = fbrk.c("google.internal.feedback.v1.SurveyService", "RecordEventAnonymous");
                                            fbrhVarA4.b();
                                            faem faemVar3 = faem.a;
                                            evrr evrrVar4 = fcrj.a;
                                            fbrhVarA4.a = new fcrh(faemVar3);
                                            fbrhVarA4.b = new fcrh(faeo.a);
                                            fbrkVarA4 = fbrhVarA4.a();
                                            faex.d = fbrkVarA4;
                                        }
                                    }
                                }
                                listenableFutureA = fcrw.a(fbndVar4.a(fbrkVarA4, faewVarA.b), faemVar);
                            }
                            eork.r(listenableFutureA, new ecrd(ecrhVar2, exnaVar4, ecscVar2), ecqx.a());
                        } catch (evtj e) {
                            Log.e("NetworkCallerGrpc", "Failed to convert scone record event request to feedback1p.", e);
                        }
                    }
                });
            }
        }
        ecqpVar.a = exoz.a;
        ecqpVar.g = 1;
    }
}
