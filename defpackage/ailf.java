package defpackage;

import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ailf implements aiwu {
    static final cczv a = cdag.f(cdag.b, "MessageStatusMaxRows", 300);
    public static final /* synthetic */ int b = 0;
    private final cogw c;
    private brdp d;
    private final crqv e;

    public ailf(cogw cogwVar, crqv crqvVar) {
        this.c = cogwVar;
        this.e = crqvVar;
    }

    public static boolean i(String str) {
        return dhim.a(str, MessagesTable.c.a.toString());
    }

    @Override // defpackage.aiwu
    public final int a() {
        if (!((Boolean) ccze.V.e()).booleanValue()) {
            return 0;
        }
        cogw cogwVar = this.c;
        final long epochMilli = cogwVar.f().toEpochMilli();
        final long millis = TimeUnit.DAYS.toMillis(((Integer) ccze.W.e()).intValue());
        final long millis2 = TimeUnit.DAYS.toMillis(((Integer) ccze.X.e()).intValue());
        String[] strArr = bqub.a;
        bqty bqtyVar = new bqty(bqub.a);
        bqtyVar.A("MessageStatusLoggerImpl#cleanup1");
        final long jMax = Math.max(bqtyVar.b().j(bqub.c.a) - ((Long) a.e()).longValue(), 0L);
        bqtt bqttVar = new bqtt();
        bqttVar.f("MessageStatusLoggerImpl#cleanup#messagestatus1");
        bqttVar.a(new Function() { // from class: aila
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqua bquaVar = (bqua) obj;
                int i = ailf.b;
                bquaVar.ap(new dqty("message_status._id", 10, Long.valueOf(jMax)));
                return bquaVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int iD = bqttVar.d();
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("MessageStatusLoggerImpl#cleanup2");
        brdrVarD.f(new Function() { // from class: ailb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                int i = ailf.b;
                return ((bran) obj).k;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdrVarD.h(new Function() { // from class: ailc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                brec brecVar = (brec) obj;
                int i = ailf.b;
                brecVar.q(bqub.c.b);
                brecVar.ai(1, 2, 11, 15, 14, 100);
                return brecVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        final brdp brdpVarB = brdrVarD.b();
        bqtt bqttVar2 = new bqtt();
        bqttVar2.f("MessageStatusLoggerImpl#cleanup#messagestatus2");
        bqttVar2.a(new Function() { // from class: aild
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqua bquaVar = (bqua) obj;
                int i = ailf.b;
                final long j = epochMilli;
                final long j2 = millis2;
                final long j3 = millis;
                final brdp brdpVar = brdpVarB;
                Function[] functionArr = {new Function() { // from class: aikv
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bqua bquaVar2 = (bqua) obj2;
                        int i2 = ailf.b;
                        bquaVar2.ap(new dqpn("message_status.message_id", 5));
                        return bquaVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: aikw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bqua bquaVar2 = (bqua) obj2;
                        int i2 = ailf.b;
                        bquaVar2.c(j - j2);
                        return bquaVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: aikx
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bqua bquaVar2 = (bqua) obj2;
                        int i2 = ailf.b;
                        bquaVar2.c(j - j3);
                        bquaVar2.ar(new dqwh(brdpVar));
                        return bquaVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }};
                bqua[] bquaVarArr = new bqua[3];
                for (int i2 = 0; i2 < 3; i2++) {
                    Function function = functionArr[i2];
                    String[] strArr2 = bqub.a;
                    bquaVarArr[i2] = (bqua) function.apply(new bqua());
                }
                bquaVar.aq(bquaVarArr);
                return bquaVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int iD2 = iD + bqttVar2.d();
        crqv crqvVar = this.e;
        crqvVar.j("message_status_cleaup_rows_deleted", iD2);
        crqvVar.k("message_status_cleaup_time_millis", cogwVar.f().toEpochMilli());
        return iD2;
    }

    @Override // defpackage.aiwu
    public final aiwv b() {
        aiwv aiwvVar = new aiwv();
        String[] strArr = bqub.a;
        String[] strArr2 = bqub.a;
        bqty bqtyVar = new bqty(strArr2);
        bqtyVar.A("MessageStatusLoggerImpl#getRowCount");
        aiwvVar.a = bqtyVar.b().h();
        bqty bqtyVar2 = new bqty(strArr2);
        bqtyVar2.A("MessageStatusLoggerImpl#getSizeEstimate");
        bqtk bqtkVar = (bqtk) bqtyVar2.b().p();
        int length = 0;
        while (true) {
            try {
                bqsq bqsqVar = (bqsq) bqtkVar.cS();
                if (bqsqVar == null) {
                    bqtkVar.close();
                    aiwvVar.b = length;
                    bqty bqtyVar3 = new bqty(bqub.a);
                    bqtyVar3.A("getEarliestTimestamp");
                    aiwvVar.c = bqtyVar3.b().k(bqub.c.c);
                    crqv crqvVar = this.e;
                    aiwvVar.d = crqvVar.e("message_status_cleaup_time_millis", 0L);
                    aiwvVar.e = crqvVar.d("message_status_cleaup_rows_deleted", 0);
                    return aiwvVar;
                }
                length += bqsqVar.a().length();
            } catch (Throwable th) {
                try {
                    bqtkVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    @Override // defpackage.aiwu
    public final String c(aiwt aiwtVar) {
        return aiwtVar.d;
    }

    @Override // defpackage.aiwu
    public final String d(int i, String str) {
        String strA = avbn.a(i);
        if (i == 4) {
            if (str != null) {
                Scanner scanner = new Scanner(str);
                String str2 = strA + " creator: " + elny.b(scanner.nextInt()).name();
                scanner.useDelimiter("\\z");
                if (scanner.hasNext()) {
                    String next = scanner.next();
                    if (!TextUtils.isEmpty(next)) {
                        return a.q(next, str2, "-");
                    }
                }
                return str2;
            }
        } else if (i == 0) {
            return str;
        }
        return strA;
    }

    @Override // defpackage.aiwu
    public final void e() {
        brdr brdrVarD = MessagesTable.d();
        brdrVarD.A("MessageStatusLoggerImpl#init");
        brdrVarD.e(new Function() { // from class: aikz
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bran branVar = (bran) obj;
                int i = ailf.b;
                return new brao[]{branVar.a, branVar.k};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        brdp brdpVarB = brdrVarD.b();
        this.d = brdpVarB;
        brdpVarB.M(new aile(this));
    }

    @Override // defpackage.aiwu
    public final void f(MessageIdType messageIdType, avbo avboVar) {
        String str;
        aiwt aiwtVar = aiwt.SEND_UPDATE;
        switch (avboVar.a) {
            case -1:
                str = "PENDING";
                break;
            case 0:
                str = "SUCCEEDED";
                break;
            case 1:
                str = "AUTO_RETRY";
                break;
            case 2:
                str = "MANUAL_RETRY";
                break;
            case 3:
                str = "NO_RETRY";
                break;
            case 4:
                str = "FALLBACK_TO_XMS";
                break;
            case 5:
                str = "NO_RETRY_NO_FALLBACK";
                break;
            case 6:
                str = "SEND_AGAIN";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        h(messageIdType, aiwtVar, Optional.of(str + ", error: " + avboVar.b));
    }

    public final void g(MessageIdType messageIdType, int i, Optional optional) {
        if (((Boolean) ccze.V.e()).booleanValue()) {
            cqaz.h();
            long epochMilli = this.c.f().toEpochMilli();
            String[] strArr = bqub.a;
            bqsv bqsvVar = new bqsv();
            bqsvVar.e(messageIdType.c() ? null : messageIdType.b());
            bqsvVar.g(epochMilli);
            bqsvVar.f(i);
            if (optional.isPresent()) {
                bqsvVar.d((String) optional.get());
            }
            bqsvVar.b();
        }
    }

    public final void h(MessageIdType messageIdType, aiwt aiwtVar, Optional optional) {
        if (((Boolean) ccze.V.e()).booleanValue()) {
            cqaz.h();
            long epochMilli = this.c.f().toEpochMilli();
            String[] strArr = bqub.a;
            bqsv bqsvVar = new bqsv();
            bqsvVar.e(messageIdType.c() ? null : messageIdType.b());
            bqsvVar.g(epochMilli);
            bqsvVar.c(aiwtVar);
            if (optional.isPresent()) {
                bqsvVar.d((String) optional.get());
            }
            bqsvVar.b();
        }
    }

    @Override // defpackage.aiwu
    public final byte[] j() {
        evqs evqsVar = evqs.b;
        evqr evqrVar = new evqr();
        PrintWriter printWriter = new PrintWriter((OutputStream) evqrVar, true);
        String[] strArr = bqub.a;
        bqty bqtyVar = new bqty(bqub.a);
        bqtyVar.A("MessageStatusLogger#dump-message_status");
        bqtyVar.c(new Function() { // from class: aiky
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                bqti bqtiVar = (bqti) obj;
                int i = ailf.b;
                return new bqtj[]{bqtiVar.c, bqtiVar.b, bqtiVar.d, bqtiVar.f};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        bqtk bqtkVar = (bqtk) bqtyVar.b().p();
        while (bqtkVar.moveToNext()) {
            try {
                printWriter.append((CharSequence) Long.toString(bqtkVar.e())).append('\t');
                if (bqtkVar.h() != null) {
                    printWriter.append((CharSequence) bqtkVar.h());
                }
                printWriter.append('\t').append((CharSequence) Integer.toString(bqtkVar.c())).append('\t');
                if (bqtkVar.g() != null) {
                    printWriter.append((CharSequence) bqtkVar.g());
                }
                printWriter.append('\n');
            } catch (Throwable th) {
                try {
                    bqtkVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        bqtkVar.close();
        printWriter.flush();
        byte[] bArrI = evqrVar.b().I();
        printWriter.close();
        return dhja.x(bArrI, 524288);
    }
}
