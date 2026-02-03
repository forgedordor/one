package defpackage;

import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class azze {
    public static final fcsu a = new fcsu() { // from class: azzd
        @Override // defpackage.fcsu
        public final Object b() {
            String[] strArr = azcg.a;
            azcd azcdVar = new azcd(azcg.a);
            azcdVar.v();
            azcdVar.k(new azce((azcf) new Function() { // from class: azzc
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo536andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    azcf azcfVar = (azcf) obj;
                    azcfVar.ap(new dqpn("message_captions_backup.caption", 6));
                    return azcfVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }.apply(new azcf())));
            azbs azbsVar = azcg.c.a;
            azcdVar.n(new dqxl("$V", new Object[]{azbsVar}), "backup_id");
            bqan bqanVar = bqbb.c.a;
            azcdVar.n(new dqxl("$V{J:bugle_message_captions}", new Object[]{bqanVar}), "bugle_id");
            azcd azcdVar2 = (azcd) azcdVar.j(azvg.c(azbsVar, azvt.b, "message_captions_id_map", false, 16));
            bqay bqayVar = new bqay(bqbb.a);
            bqayVar.v();
            dqtr dqtrVarH = dqts.h(bqayVar.a());
            String[] strArr2 = bmkn.a;
            bmkm bmkmVar = new bmkm();
            bmkmVar.ar(new dqxl("$V{J:bugle_message_captions} = $V{J:message_captions_id_map}", new Object[]{bqanVar, bmkn.c.d}));
            dqos dqosVar = (dqos) dqtrVarH;
            dqosVar.d = new bmkl(bmkmVar);
            dqosVar.e = "bugle_message_captions";
            return fcva.b((azcd) azcdVar2.j(dqtrVarH));
        }
    };
}
