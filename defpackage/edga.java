package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class edga implements edgc {
    public final edgd a;
    private final eosc b;

    public edga(edgd edgdVar, eosc eoscVar) {
        this.a = edgdVar;
        this.b = eoscVar;
    }

    private final ListenableFuture l(final edfz edfzVar) {
        return eooh.g(a(edfzVar), fbtf.class, new eooz() { // from class: edfr
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                fbtf fbtfVar = (fbtf) obj;
                if (!fbtfVar.a.getCode().equals(Status.Code.UNAUTHENTICATED)) {
                    return eork.h(fbtfVar);
                }
                if (Log.isLoggable("AuthRetryingCustardStub", 4)) {
                    Log.i("AuthRetryingCustardStub", "Refreshing expired auth token", fbtfVar);
                }
                edfz edfzVar2 = edfzVar;
                edga edgaVar = this.a;
                edgaVar.a.b();
                return edgaVar.a(edfzVar2);
            }
        }, this.b);
    }

    public final eoqt a(final edfz edfzVar) {
        return (eoqt) eooq.g(eoqt.t(this.a.a()), new eooz() { // from class: edfo
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                return edfzVar.a((etun) obj);
            }
        }, this.b);
    }

    @Override // defpackage.edgc
    public final ListenableFuture b(final etuu etuuVar) {
        return l(new edfz() { // from class: edfu
            @Override // defpackage.edfz
            public final ListenableFuture a(etun etunVar) {
                fbrk fbrkVarA = etuo.c;
                if (fbrkVarA == null) {
                    synchronized (etuo.class) {
                        fbrkVarA = etuo.c;
                        if (fbrkVarA == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.internal.contactsui.v1.CustardService", "GetProfilePhotoArtCollectionImages");
                            fbrhVarA.b();
                            etuu etuuVar2 = etuu.a;
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(etuuVar2);
                            fbrhVarA.b = new fcrh(etuw.a);
                            fbrkVarA = fbrhVarA.a();
                            etuo.c = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(etunVar.a.a(fbrkVarA, etunVar.b), etuuVar);
            }
        });
    }

    @Override // defpackage.edgc
    public final ListenableFuture c(final etuy etuyVar) {
        return l(new edfz() { // from class: edfs
            @Override // defpackage.edfz
            public final ListenableFuture a(etun etunVar) {
                fbrk fbrkVarA = etuo.d;
                if (fbrkVarA == null) {
                    synchronized (etuo.class) {
                        fbrkVarA = etuo.d;
                        if (fbrkVarA == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.internal.contactsui.v1.CustardService", "GetProfilePhotoArtFullImage");
                            fbrhVarA.b();
                            etuy etuyVar2 = etuy.a;
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(etuyVar2);
                            fbrhVarA.b = new fcrh(etva.a);
                            fbrkVarA = fbrhVarA.a();
                            etuo.d = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(etunVar.a.a(fbrkVarA, etunVar.b), etuyVar);
            }
        });
    }

    @Override // defpackage.edgc
    public final ListenableFuture d(final etvc etvcVar) {
        return l(new edfz() { // from class: edft
            @Override // defpackage.edfz
            public final ListenableFuture a(etun etunVar) {
                fbrk fbrkVarA = etuo.e;
                if (fbrkVarA == null) {
                    synchronized (etuo.class) {
                        fbrkVarA = etuo.e;
                        if (fbrkVarA == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.internal.contactsui.v1.CustardService", "GetProfilePhotoArtHomeSuggestions");
                            fbrhVarA.b();
                            etvc etvcVar2 = etvc.a;
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(etvcVar2);
                            fbrhVarA.b = new fcrh(etve.a);
                            fbrkVarA = fbrhVarA.a();
                            etuo.e = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(etunVar.a.a(fbrkVarA, etunVar.b), etvcVar);
            }
        });
    }

    @Override // defpackage.edgc
    public final ListenableFuture e(final etvg etvgVar) {
        return l(new edfz() { // from class: edfq
            @Override // defpackage.edfz
            public final ListenableFuture a(etun etunVar) {
                return fcrw.a(etunVar.a.a(etuo.b(), etunVar.b), etvgVar);
            }
        });
    }

    @Override // defpackage.edgc
    public final ListenableFuture f(final etvo etvoVar) {
        return l(new edfz() { // from class: edfy
            @Override // defpackage.edfz
            public final ListenableFuture a(etun etunVar) {
                fbrk fbrkVarA = etuo.f;
                if (fbrkVarA == null) {
                    synchronized (etuo.class) {
                        fbrkVarA = etuo.f;
                        if (fbrkVarA == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.internal.contactsui.v1.CustardService", "GetSearchInterests");
                            fbrhVarA.b();
                            etvo etvoVar2 = etvo.a;
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(etvoVar2);
                            fbrhVarA.b = new fcrh(etvq.a);
                            fbrkVarA = fbrhVarA.a();
                            etuo.f = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(etunVar.a.a(fbrkVarA, etunVar.b), etvoVar);
            }
        });
    }

    @Override // defpackage.edgc
    public final ListenableFuture g(final etwc etwcVar) {
        return l(new edfz() { // from class: edfv
            @Override // defpackage.edfz
            public final ListenableFuture a(etun etunVar) {
                fbrk fbrkVarA = etuo.i;
                if (fbrkVarA == null) {
                    synchronized (etuo.class) {
                        fbrkVarA = etuo.i;
                        if (fbrkVarA == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.internal.contactsui.v1.CustardService", "ListProfilePhotoArtCollectionsByCategory");
                            fbrhVarA.b();
                            etwc etwcVar2 = etwc.a;
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(etwcVar2);
                            fbrhVarA.b = new fcrh(etwe.a);
                            fbrkVarA = fbrhVarA.a();
                            etuo.i = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(etunVar.a.a(fbrkVarA, etunVar.b), etwcVar);
            }
        });
    }

    @Override // defpackage.edgc
    public final ListenableFuture h(final etwg etwgVar) {
        return l(new edfz() { // from class: edfp
            @Override // defpackage.edfz
            public final ListenableFuture a(etun etunVar) {
                fbrk fbrkVarA = etuo.h;
                if (fbrkVarA == null) {
                    synchronized (etuo.class) {
                        fbrkVarA = etuo.h;
                        if (fbrkVarA == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.internal.contactsui.v1.CustardService", "ListProfilePhotoArtSearchSuggestions");
                            fbrhVarA.b();
                            etwg etwgVar2 = etwg.a;
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(etwgVar2);
                            fbrhVarA.b = new fcrh(etwi.a);
                            fbrkVarA = fbrhVarA.a();
                            etuo.h = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(etunVar.a.a(fbrkVarA, etunVar.b), etwgVar);
            }
        });
    }

    @Override // defpackage.edgc
    public final ListenableFuture i(final etwk etwkVar) {
        return l(new edfz() { // from class: edfn
            @Override // defpackage.edfz
            public final ListenableFuture a(etun etunVar) {
                fbrk fbrkVarA = etuo.b;
                if (fbrkVarA == null) {
                    synchronized (etuo.class) {
                        fbrkVarA = etuo.b;
                        if (fbrkVarA == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.internal.contactsui.v1.CustardService", "ListProfilePhotosClusterSuggestions");
                            fbrhVarA.b();
                            etwk etwkVar2 = etwk.a;
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(etwkVar2);
                            fbrhVarA.b = new fcrh(etwm.a);
                            fbrkVarA = fbrhVarA.a();
                            etuo.b = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(etunVar.a.a(fbrkVarA, etunVar.b), etwkVar);
            }
        });
    }

    @Override // defpackage.edgc
    public final ListenableFuture j(final etwo etwoVar) {
        return l(new edfz() { // from class: edfw
            @Override // defpackage.edfz
            public final ListenableFuture a(etun etunVar) {
                fbrk fbrkVarA = etuo.a;
                if (fbrkVarA == null) {
                    synchronized (etuo.class) {
                        fbrkVarA = etuo.a;
                        if (fbrkVarA == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.internal.contactsui.v1.CustardService", "ListProfilePhotosPhotoSuggestions");
                            fbrhVarA.b();
                            etwo etwoVar2 = etwo.a;
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(etwoVar2);
                            fbrhVarA.b = new fcrh(etwq.a);
                            fbrkVarA = fbrhVarA.a();
                            etuo.a = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(etunVar.a.a(fbrkVarA, etunVar.b), etwoVar);
            }
        });
    }

    @Override // defpackage.edgc
    public final ListenableFuture k(final etxc etxcVar) {
        return l(new edfz() { // from class: edfx
            @Override // defpackage.edfz
            public final ListenableFuture a(etun etunVar) {
                fbrk fbrkVarA = etuo.g;
                if (fbrkVarA == null) {
                    synchronized (etuo.class) {
                        fbrkVarA = etuo.g;
                        if (fbrkVarA == null) {
                            fbrh fbrhVarA = fbrk.a();
                            fbrhVarA.c = fbrj.UNARY;
                            fbrhVarA.d = fbrk.c("google.internal.contactsui.v1.CustardService", "SearchProfilePhotoArt");
                            fbrhVarA.b();
                            etxc etxcVar2 = etxc.a;
                            evrr evrrVar = fcrj.a;
                            fbrhVarA.a = new fcrh(etxcVar2);
                            fbrhVarA.b = new fcrh(etxe.a);
                            fbrkVarA = fbrhVarA.a();
                            etuo.g = fbrkVarA;
                        }
                    }
                }
                return fcrw.a(etunVar.a.a(fbrkVarA, etunVar.b), etxcVar);
            }
        });
    }
}
