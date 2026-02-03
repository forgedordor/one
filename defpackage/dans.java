package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ListIterator;
import java.util.concurrent.Callable;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dans implements ddix {
    public final cogw a;
    private final Optional b;
    private final eosc c;
    private ListIterator d;
    private boolean e = false;

    public dans(Optional optional, eosc eoscVar, cogw cogwVar) {
        this.b = optional;
        this.c = eoscVar;
        int i = ekgb.d;
        this.d = ekoe.a.iterator();
        this.a = cogwVar;
    }

    @Override // defpackage.ddix
    public final void a(ddkb ddkbVar) {
        Callable callable = new Callable() { // from class: danp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.a.c();
            }
        };
        eosc eoscVar = this.c;
        eijx.g(callable, eoscVar).k(auwc.a(new danr(ddkbVar)), eoscVar);
    }

    @Override // defpackage.ddix
    public final void b() {
        this.b.ifPresent(new Consumer() { // from class: danq
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                ((cdek) obj).c(this.a.a.f().toEpochMilli() - ((Long) cdej.c.e()).longValue());
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }

    public final synchronized ListIterator c() {
        if (this.e) {
            return this.d;
        }
        Optional optional = this.b;
        optional.isPresent();
        optional.get();
        brle brleVarA = brlh.a();
        brleVarA.A("getP2pSuggestionEvents");
        brleVarA.s();
        ekgb ekgbVarY = brleVarA.b().y(new ejvr() { // from class: abwf
            @Override // defpackage.ejvr
            public final Object apply(Object obj) {
                brkj brkjVar;
                ekgb ekgbVarG;
                int i;
                ekgb ekgbVarG2;
                brkj brkjVar2 = (brkj) obj;
                MessageIdType messageIdTypeG = brkjVar2.g();
                String strL = brkjVar2.l();
                if (strL == null) {
                    throw new NullPointerException("Null id");
                }
                elqn elqnVarH = brkjVar2.h();
                if (elqnVarH == null) {
                    throw new NullPointerException("Null eventType");
                }
                emig emigVarI = brkjVar2.i();
                if (emigVarI == null) {
                    throw new NullPointerException("Null replyMode");
                }
                eyzv eyzvVarJ = brkjVar2.j();
                if (eyzvVarJ == null) {
                    throw new NullPointerException("Null actionSource");
                }
                ezac ezacVarK = brkjVar2.k();
                if (ezacVarK == null) {
                    throw new NullPointerException("Null rejectionReason");
                }
                int iE = brkjVar2.e();
                int iC = brkjVar2.c();
                long jF = brkjVar2.f();
                String strB = ejwk.b(brkjVar2.m());
                String strO = brkjVar2.o();
                if (strO == null) {
                    int i2 = ekgb.d;
                    ekgbVarG = ekoe.a;
                    brkjVar = brkjVar2;
                } else {
                    int i3 = ekgb.d;
                    ekfw ekfwVar = new ekfw();
                    String[] strArrSplit = strO.split(",", 0);
                    int length = strArrSplit.length;
                    brkjVar = brkjVar2;
                    int i4 = 0;
                    while (i4 < length) {
                        String str = strArrSplit[i4];
                        if (str.isEmpty()) {
                            i = i4;
                        } else {
                            i = i4;
                            ekfwVar.h(Long.valueOf(str));
                        }
                        i4 = i + 1;
                    }
                    ekgbVarG = ekfwVar.g();
                }
                if (ekgbVarG == null) {
                    throw new NullPointerException("Null suggestionTypes");
                }
                String strN = brkjVar.n();
                if (strN == null) {
                    ekgbVarG2 = ekoe.a;
                } else {
                    ekfw ekfwVar2 = new ekfw();
                    int i5 = 0;
                    String[] strArrSplit2 = strN.split(",", 0);
                    int length2 = strArrSplit2.length;
                    while (i5 < length2) {
                        String[] strArr = strArrSplit2;
                        String str2 = strArr[i5];
                        if (!str2.isEmpty()) {
                            ekfwVar2.h(str2);
                        }
                        i5++;
                        strArrSplit2 = strArr;
                    }
                    ekgbVarG2 = ekfwVar2.g();
                }
                ekgb ekgbVar = ekgbVarG2;
                if (ekgbVar != null) {
                    return new cdel(strL, elqnVarH, emigVarI, eyzvVarJ, ezacVarK, iE, iC, jF, strB, ekgbVarG, ekgbVar, messageIdTypeG);
                }
                throw new NullPointerException("Null modelOutputLabels");
            }
        });
        this.e = true;
        ekqh it = ekgbVarY.iterator();
        this.d = it;
        return it;
    }

    @Override // defpackage.ddix, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
