package defpackage;

import android.content.Context;
import android.net.Uri;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bwdg implements cmok {
    private static final cqce a = cqce.g("BugleE2eeEtouffee", "EncryptedFileReceiver");
    private final Context b;
    private final fcsu c;
    private final Optional d;
    private final fcsu e;
    private final bwey f;
    private final fcsu g;
    private final apsl h;
    private final fcsu i;

    public bwdg(Context context, fcsu fcsuVar, Optional optional, fcsu fcsuVar2, bwey bweyVar, fcsu fcsuVar3, apsl apslVar, fcsu fcsuVar4) {
        this.b = context;
        this.c = fcsuVar;
        this.d = optional;
        this.e = fcsuVar2;
        this.f = bweyVar;
        this.g = fcsuVar3;
        this.h = apslVar;
        this.i = fcsuVar4;
    }

    private static boolean b(final basd basdVar) {
        bpil bpilVarA = bpio.a();
        bpilVarA.A("isEncrypted");
        bpilVarA.c(new Function() { // from class: bwdc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bpin bpinVar = (bpin) obj;
                bpinVar.b(basdVar);
                return bpinVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return bpilVarA.b().U();
    }

    private static final evqs c(byte[] bArr) {
        bArr.getClass();
        return evqs.x(bArr);
    }

    @Override // defpackage.cmok
    public final Uri a(final basd basdVar, Uri uri, int i) {
        epwa epwaVarG;
        cbtf cbteVar;
        cbqz cbqzVar;
        InputStream inputStreamA;
        final Uri uri2 = uri;
        eieu eieuVarK = eiiy.k("EtouffeeFileReceiver#convertFile");
        try {
            if (b(basdVar)) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                try {
                    Context context = this.b;
                    InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri2);
                    try {
                        if (inputStreamOpenInputStream == null) {
                            ((ains) this.e.b()).e("Bugle.Etouffee.FileDecryptionFailed.Status", 1);
                            throw new FileNotFoundException(a.E(uri2, "fileUri was not found, fileUri="));
                        }
                        eieu eieuVarK2 = eiiy.k("EtouffeeFileReceiver#convertStream");
                        try {
                            if (b(basdVar)) {
                                bpil bpilVarA = bpio.a();
                                bpilVarA.A("getEtouffeeMessageByRcsId1");
                                bpilVarA.c(new Function() { // from class: bwdd
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo536andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bpin bpinVar = (bpin) obj;
                                        bpinVar.b(basdVar);
                                        return bpinVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                bphn bphnVar = (bphn) bpilVarA.b().p();
                                try {
                                    if (!bphnVar.moveToFirst()) {
                                        this.f.c(basdVar, 39);
                                        atomicBoolean.set(true);
                                        ((ains) this.e.b()).e("Bugle.Etouffee.FileDecryptionFailed.Status", 3);
                                        throw new IllegalStateException("Can't open encrypted stream.");
                                    }
                                    try {
                                        epwaVarG = bphnVar.g();
                                    } catch (fbtf e) {
                                        e = e;
                                    }
                                    try {
                                        if (epwaVarG == null) {
                                            eyfm eyfmVar = (eyfm) eyfn.a.createBuilder();
                                            if (i == 2) {
                                                evqs evqsVarC = c(bphnVar.l());
                                                eyfmVar.copyOnWrite();
                                                eyfn eyfnVar = (eyfn) eyfmVar.instance;
                                                eyfnVar.b |= 1;
                                                eyfnVar.c = evqsVarC;
                                                evqs evqsVarC2 = c(bphnVar.k());
                                                eyfmVar.copyOnWrite();
                                                eyfn eyfnVar2 = (eyfn) eyfmVar.instance;
                                                eyfnVar2.b |= 2;
                                                eyfnVar2.d = evqsVarC2;
                                                int iC = bphnVar.c();
                                                eyfmVar.copyOnWrite();
                                                eyfn eyfnVar3 = (eyfn) eyfmVar.instance;
                                                eyfnVar3.b |= 4;
                                                eyfnVar3.e = iC;
                                            } else {
                                                evqs evqsVarC3 = c(bphnVar.n());
                                                eyfmVar.copyOnWrite();
                                                eyfn eyfnVar4 = (eyfn) eyfmVar.instance;
                                                eyfnVar4.b |= 1;
                                                eyfnVar4.c = evqsVarC3;
                                                evqs evqsVarC4 = c(bphnVar.m());
                                                eyfmVar.copyOnWrite();
                                                eyfn eyfnVar5 = (eyfn) eyfmVar.instance;
                                                eyfnVar5.b |= 2;
                                                eyfnVar5.d = evqsVarC4;
                                                int iE = bphnVar.e();
                                                eyfmVar.copyOnWrite();
                                                eyfn eyfnVar6 = (eyfn) eyfmVar.instance;
                                                eyfnVar6.b |= 4;
                                                eyfnVar6.e = iE;
                                            }
                                            cbteVar = new cbte((eyfn) eyfmVar.build());
                                        } else if (i == 2) {
                                            epwc epwcVar = epwaVarG.c;
                                            if (epwcVar == null) {
                                                epwcVar = epwc.a;
                                            }
                                            cbteVar = new cbtd(epwcVar);
                                        } else {
                                            epwc epwcVar2 = epwaVarG.d;
                                            if (epwcVar2 == null) {
                                                epwcVar2 = epwc.a;
                                            }
                                            cbteVar = new cbtd(epwcVar2);
                                        }
                                        cbth cbthVar = (cbth) this.g.b();
                                        if (cbteVar instanceof cbtd) {
                                            cbqzVar = cbqz.c;
                                        } else {
                                            if (!(cbteVar instanceof cbte)) {
                                                throw new fctg();
                                            }
                                            cbqzVar = cbqz.b;
                                        }
                                        cbqzVar.getClass();
                                        Object obj = cbthVar.a.get(1L);
                                        obj.getClass();
                                        inputStreamA = ((cbtg) obj).a(inputStreamOpenInputStream, cbteVar);
                                        bphnVar.close();
                                    } catch (fbtf e2) {
                                        e = e2;
                                        this.f.c(basdVar, 40);
                                        atomicBoolean.set(true);
                                        ((ains) this.e.b()).e("Bugle.Etouffee.FileDecryptionFailed.Status", 4);
                                        throw e;
                                    }
                                } finally {
                                }
                            } else {
                                inputStreamA = inputStreamOpenInputStream;
                            }
                            eieuVarK2.close();
                            try {
                                Uri uriG = bxlf.g(inputStreamA, context);
                                if (uriG == null) {
                                    this.f.c(basdVar, 38);
                                    atomicBoolean.set(true);
                                    ((ains) this.e.b()).e("Bugle.Etouffee.FileDecryptionFailed.Status", 2);
                                    throw new IOException("Failed to store decrypted data to internal storage.");
                                }
                                context.getContentResolver().delete(uri2, null, null);
                                if (this.h.a()) {
                                    ((awlc) this.i.b()).d(new Consumer() { // from class: bwde
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void z(Object obj2) {
                                            ((cmvv) obj2).b(uri2);
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                } else {
                                    this.d.ifPresent(new Consumer() { // from class: bwdf
                                        @Override // java.util.function.Consumer
                                        /* renamed from: accept */
                                        public final void z(Object obj2) {
                                            ((cmvv) ((fcsu) obj2).b()).b(uri2);
                                        }

                                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                            return Consumer$CC.$default$andThen(this, consumer);
                                        }
                                    });
                                }
                                inputStreamA.close();
                                inputStreamOpenInputStream.close();
                                uri2 = uriG;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th) {
                    cqbd cqbdVarE = a.e();
                    cqbdVarE.I("Unable to decrypt stream");
                    cqbdVarE.A("rcsMessageId", basdVar);
                    cqbdVarE.s(th);
                    if (!atomicBoolean.get()) {
                        if (th instanceof FileNotFoundException) {
                            this.f.c(basdVar, 37);
                        } else {
                            this.f.c(basdVar, 41);
                        }
                    }
                    ellg ellgVar = (ellg) ellh.a.createBuilder();
                    ellf ellfVar = ellf.BUGLE_E2EE_ATTACHMENT_FAILED_TO_DECRYPT_USING_OTMK;
                    ellgVar.copyOnWrite();
                    ellh ellhVar = (ellh) ellgVar.instance;
                    ellhVar.j = ellfVar.f11do;
                    ellhVar.b |= 1;
                    elyh elyhVar = (elyh) elyi.a.createBuilder();
                    String strB = ejwk.b(basdVar.b);
                    elyhVar.copyOnWrite();
                    elyi elyiVar = (elyi) elyhVar.instance;
                    elyiVar.b = 1 | elyiVar.b;
                    elyiVar.c = strB;
                    ellgVar.copyOnWrite();
                    ellh ellhVar2 = (ellh) ellgVar.instance;
                    elyi elyiVar2 = (elyi) elyhVar.build();
                    elyiVar2.getClass();
                    ellhVar2.ac = elyiVar2;
                    ellhVar2.c |= 536870912;
                    ((aill) this.c.b()).j(ellgVar);
                    throw th;
                }
            }
            eieuVarK.close();
            return uri2;
        } finally {
        }
    }
}
