package defpackage;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kwy {
    public static Person a(kxa kxaVar) {
        Person.Builder name = new Person.Builder().setName(kxaVar.a);
        IconCompat iconCompat = kxaVar.b;
        return name.setIcon(iconCompat != null ? iconCompat.c() : null).setUri(kxaVar.c).setKey(kxaVar.d).setBot(kxaVar.e).setImportant(kxaVar.f).build();
    }

    static kxa b(Person person) {
        kwz kwzVar = new kwz();
        kwzVar.a = person.getName();
        kwzVar.b = person.getIcon() != null ? kzt.e(person.getIcon()) : null;
        kwzVar.c = person.getUri();
        kwzVar.d = person.getKey();
        kwzVar.e = person.isBot();
        kwzVar.f = person.isImportant();
        return new kxa(kwzVar);
    }
}
