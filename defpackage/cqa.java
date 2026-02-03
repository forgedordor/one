package defpackage;

import androidx.car.app.messaging.model.ConversationItem;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.Row;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cqa {
    public static final cqa a;
    public static final cqa b;
    public final int c;
    public final cpy d;
    public final boolean e;

    static {
        cpz cpzVar = new cpz();
        cpzVar.a = 0;
        cpzVar.b = cpy.b;
        cpzVar.c = false;
        cqa cqaVar = new cqa(cpzVar);
        a = cqaVar;
        cpz cpzVar2 = new cpz(cqaVar);
        cpzVar2.a = 2;
        cpzVar2.b = cpy.c;
        cpzVar2.c = false;
        new cpz(cqaVar).b = cpy.d;
        cpz cpzVar3 = new cpz(cqaVar);
        cpzVar3.b = cpy.d;
        cpzVar3.c = true;
        cpz cpzVar4 = new cpz(cqaVar);
        cpzVar4.b = cpy.d;
        cpzVar4.c = true;
        cpz cpzVar5 = new cpz(cqaVar);
        cpzVar5.b = cpy.e;
        cpzVar5.c = true;
        b = new cqa(cpzVar5);
    }

    public cqa(cpz cpzVar) {
        this.c = cpzVar.a;
        this.d = cpzVar.b;
        this.e = cpzVar.c;
    }

    public final void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cny cnyVar = (cny) it.next();
            if (cnyVar instanceof Row) {
                cpy cpyVar = this.d;
                Row row = (Row) cnyVar;
                if (!cpyVar.j && row.getOnClickDelegate() != null) {
                    throw new IllegalArgumentException("A click listener is not allowed on the row");
                }
                if (!cpyVar.i && row.getToggle() != null) {
                    throw new IllegalArgumentException("A toggle is not allowed on the row");
                }
                CarIcon image = row.getImage();
                if (image != null) {
                    if (!cpyVar.h) {
                        throw new IllegalArgumentException("An image is not allowed on the row");
                    }
                    cpyVar.k.a(image);
                }
                int size = row.getTexts().size();
                int i = cpyVar.f;
                if (size > i) {
                    throw new IllegalArgumentException(a.g(i, "The number of lines of texts for the row exceeded the supported max of "));
                }
            } else if (!(cnyVar instanceof ConversationItem)) {
                throw new IllegalArgumentException(String.format("Unsupported item type: %s", cnyVar.getClass().getSimpleName()));
            }
        }
    }
}
