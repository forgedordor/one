package defpackage;

import j$.util.function.Function$CC;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azwg implements azvb {
    public static final azwg a = new azwg();

    private azwg() {
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqpo a() {
        return ayuu.c.a;
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqws b() {
        ayur ayurVarA = ayuu.a();
        ayurVarA.A("BackupConversationParticipantsTable.QueryBuilder");
        ayurVarA.k(new ayus((ayut) new Function() { // from class: azwf
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo536andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ayut ayutVar = (ayut) obj;
                Function[] functionArr = {new Function() { // from class: azwd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        ayut ayutVar2 = (ayut) obj2;
                        int iIntValue = ayuu.c().intValue();
                        if (iIntValue < 70) {
                            dqru.x("is_c2p_only", iIntValue);
                        }
                        ayutVar2.ap(new dqpn("conversation_participants_backup.is_c2p_only", 5));
                        return ayutVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: azwe
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo536andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        ayut ayutVar2 = (ayut) obj2;
                        int iIntValue = ayuu.c().intValue();
                        if (iIntValue < 70) {
                            dqru.x("is_c2p_only", iIntValue);
                        }
                        ayutVar2.ap(new dqty("conversation_participants_backup.is_c2p_only", 1, 0));
                        return ayutVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }};
                ayut[] ayutVarArr = new ayut[2];
                for (int i = 0; i < 2; i++) {
                    Function function = functionArr[i];
                    String[] strArr = ayuu.a;
                    ayutVarArr[i] = (ayut) function.apply(new ayut());
                }
                ayutVar.aq(ayutVarArr);
                return ayutVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }.apply(new ayut())));
        return ayurVarA;
    }

    @Override // defpackage.azvb
    public final /* bridge */ /* synthetic */ dqws c(dqws dqwsVar, List list) {
        ayur ayurVar = (ayur) dqwsVar;
        ayub[] ayubVarArr = (ayub[]) list.toArray(new ayub[0]);
        ayurVar.c((ayub[]) Arrays.copyOf(ayubVarArr, ayubVarArr.length));
        return ayurVar;
    }
}
