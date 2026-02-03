package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import j$.util.function.Consumer$CC;
import j$.util.function.LongConsumer$CC;
import java.util.function.Consumer;
import java.util.function.LongConsumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class couw {
    public static aucj a(cous cousVar) {
        final atal atalVar = new atal();
        final auci auciVar = (auci) aucj.a.createBuilder();
        coud coudVar = (coud) cousVar;
        String string = coudVar.c.toString();
        auciVar.copyOnWrite();
        aucj aucjVar = (aucj) auciVar.instance;
        string.getClass();
        aucjVar.f = string;
        coudVar.e.ifPresent(new LongConsumer() { // from class: cout
            @Override // java.util.function.LongConsumer
            public final void accept(long j) {
                auci auciVar2 = auciVar;
                auciVar2.copyOnWrite();
                aucj aucjVar2 = (aucj) auciVar2.instance;
                aucj aucjVar3 = aucj.a;
                aucjVar2.d = (int) j;
            }

            public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
                return LongConsumer$CC.$default$andThen(this, longConsumer);
            }
        });
        coudVar.d.ifPresent(new Consumer() { // from class: couu
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                auci auciVar2 = auciVar;
                String str = (String) obj;
                auciVar2.copyOnWrite();
                aucj aucjVar2 = (aucj) auciVar2.instance;
                aucj aucjVar3 = aucj.a;
                str.getClass();
                aucjVar2.c = str;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        coudVar.b.ifPresent(new Consumer() { // from class: couv
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void z(Object obj) {
                aubx aubxVar = (aubx) atalVar.fH().fM((ContentType) obj);
                auci auciVar2 = auciVar;
                auciVar2.copyOnWrite();
                aucj aucjVar2 = (aucj) auciVar2.instance;
                aucj aucjVar3 = aucj.a;
                aubxVar.getClass();
                aucjVar2.e = aubxVar;
                aucjVar2.b |= 1;
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        return (aucj) auciVar.build();
    }
}
