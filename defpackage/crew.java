package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.chat.smartmessaging.smartreply.android.LanguageDetectorJni;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class crew implements crav {
    public final Context c;
    public final eosc d;
    public final cree e;
    public volatile LanguageDetectorJni f;
    public volatile String g;
    private final eosc j;
    private static final cqce h = cqce.g("Bugle", "LanguageDetectorImpl");
    private static boolean i = false;
    public static final Object a = new Object();
    public static final Object b = new Object();

    public crew(Context context, eosc eoscVar, eosc eoscVar2, cree creeVar) {
        this.c = context;
        this.j = eoscVar;
        this.d = eoscVar2;
        this.e = creeVar;
    }

    public static void c() {
        ecem.b();
        if (i) {
            return;
        }
        try {
            i = true;
            cqdk.b("language_detector_jni");
        } catch (UnsatisfiedLinkError e) {
            cqbd cqbdVarB = h.b();
            cqbdVarB.I("Problem linking language detector JNIs.");
            cqbdVarB.s(e);
        } catch (Throwable th) {
            cqbd cqbdVarB2 = h.b();
            cqbdVarB2.I("Problem loading language detector JNIs.");
            cqbdVarB2.s(th);
        }
    }

    @Override // defpackage.crav
    public final eiju a(final ezdx ezdxVar) {
        if (ezdxVar.b.isEmpty()) {
            throw new IllegalArgumentException("Cannot classify language without messages.");
        }
        return eijx.g(new Callable() { // from class: crer
            @Override // java.util.concurrent.Callable
            public final Object call() {
                crew.c();
                return null;
            }
        }, this.j).i(new eooz() { // from class: cres
            @Override // defpackage.eooz
            public final ListenableFuture a(Object obj) {
                final crew crewVar = this.a;
                final ezdx ezdxVar2 = ezdxVar;
                return crewVar.e.a().h(new ejvr() { // from class: crev
                    @Override // defpackage.ejvr
                    public final Object apply(Object obj2) {
                        crew crewVar2 = crewVar;
                        ejjv ejjvVar = (ejjv) obj2;
                        if (crewVar2.f == null) {
                            synchronized (crew.a) {
                                if (crewVar2.f == null) {
                                    crewVar2.f = new LanguageDetectorJni();
                                }
                            }
                        }
                        LanguageDetectorJni languageDetectorJni = crewVar2.f;
                        ezcx ezcxVar = (ezcx) ezcy.b.createBuilder();
                        if (crewVar2.g == null) {
                            synchronized (crew.b) {
                                if (crewVar2.g == null) {
                                    crewVar2.g = craf.c(crewVar2.c).toLanguageTag();
                                }
                            }
                        }
                        ezdx ezdxVar3 = ezdxVar2;
                        String str = crewVar2.g;
                        ezcxVar.copyOnWrite();
                        ezcy ezcyVar = (ezcy) ezcxVar.instance;
                        str.getClass();
                        ezcyVar.j = str;
                        ezcxVar.copyOnWrite();
                        ezcy ezcyVar2 = (ezcy) ezcxVar.instance;
                        ezdxVar3.getClass();
                        ezcyVar2.f = ezdxVar3;
                        ezcyVar2.c |= 2;
                        ezcy ezcyVar3 = (ezcy) ezcxVar.build();
                        ejib ejibVar = ejjvVar.c;
                        if (ejibVar == null) {
                            ejibVar = ejib.a;
                        }
                        return languageDetectorJni.a(ezcyVar3, ejibVar);
                    }
                }, crewVar.d);
            }
        }, this.d);
    }

    @Override // defpackage.crav
    public final eiju b(List list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("Cannot detect language, bad state.");
        }
        final ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MessageCoreData messageCoreData = (MessageCoreData) it.next();
            if (messageCoreData != null && !byed.g(messageCoreData.k())) {
                final String strAs = messageCoreData.as();
                if (!TextUtils.isEmpty(strAs)) {
                    arrayList.add(eijx.g(new Callable() { // from class: cret
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            ezdu ezduVar = (ezdu) ezdv.a.createBuilder();
                            ezduVar.copyOnWrite();
                            ezdv ezdvVar = (ezdv) ezduVar.instance;
                            String str = strAs;
                            str.getClass();
                            ezdvVar.b = 30;
                            ezdvVar.c = str;
                            return (ezdv) ezduVar.build();
                        }
                    }, this.j));
                }
            }
        }
        return eijx.j(arrayList).b(new eooy() { // from class: creu
            @Override // defpackage.eooy
            public final ListenableFuture a() {
                ezdw ezdwVar = (ezdw) ezdx.a.createBuilder();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ezdwVar.b((ezdv) eork.q((eiju) it2.next()));
                }
                return this.a.a((ezdx) ezdwVar.build());
            }
        }, this.j);
    }
}
