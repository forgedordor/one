package defpackage;

import j$.util.Map;
import java.lang.Character;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avoi {
    private final ekhx a;
    private final ekgb b;
    private final ekgb c;
    private final HashMap d = new HashMap();
    private final LinkedList e;

    public avoi(Function function, String str, ekhx ekhxVar) {
        Random random = (Random) function.apply(str);
        ArrayList arrayListC = ekjz.c('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K');
        Collections.shuffle(arrayListC, random);
        this.b = ekgb.n(arrayListC);
        ArrayList arrayListC2 = ekjz.c('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z');
        Collections.shuffle(arrayListC2, random);
        this.e = new LinkedList(arrayListC2);
        ArrayList arrayListC3 = ekjz.c('L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V');
        Collections.shuffle(arrayListC3, random);
        this.c = ekgb.n(arrayListC3);
        this.a = ekhxVar;
    }

    static boolean b(char c) {
        if (Character.isISOControl(c)) {
            return true;
        }
        if (Character.isLetterOrDigit(c)) {
            return false;
        }
        Character.UnicodeBlock unicodeBlockOf = Character.UnicodeBlock.of(c);
        return (unicodeBlockOf != null && unicodeBlockOf.equals(Character.UnicodeBlock.SPECIALS)) || Character.getType(c) == 16;
    }

    private final char c() {
        LinkedList linkedList = this.e;
        if (!linkedList.isEmpty()) {
            try {
                Character ch = (Character) linkedList.removeFirst();
                if (ch == null) {
                    return '?';
                }
                return ch.charValue();
            } catch (NoSuchElementException unused) {
            }
        }
        return '?';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final char a(char c) {
        if (Character.isDigit(c)) {
            if (c >= '0' && c <= '9') {
                return ((Character) this.b.get(c - '0')).charValue();
            }
            return ((Character) this.c.get(Character.digit(c, 10))).charValue();
        }
        if (!Character.isWhitespace(c) && !b(c)) {
            ekhx ekhxVar = this.a;
            Character chValueOf = Character.valueOf(c);
            if (!ekhxVar.contains(chValueOf)) {
                HashMap map = this.d;
                if (map.containsKey(chValueOf)) {
                    return ((Character) Map.EL.getOrDefault(map, chValueOf, '?')).charValue();
                }
                char c2 = c();
                map.put(chValueOf, Character.valueOf(c2));
                return c2;
            }
        }
        return c;
    }
}
