package j$.desugar.sun.nio.fs;

import j$.nio.file.EnumC0003a;
import j$.nio.file.F;
import j$.nio.file.FileSystem;
import j$.nio.file.G;
import j$.nio.file.H;
import j$.nio.file.I;
import j$.nio.file.Path;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.io.File;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes9.dex */
public final class o implements Path {
    public static final Pattern h = Pattern.compile("/+");
    public final FileSystem a;
    public final String b;
    public final List c;
    public final boolean d;
    public final String e;
    public final String f;
    public volatile byte[] g;

    public o(FileSystem fileSystem, String str, String str2, String str3) {
        this(fileSystem, str.startsWith("/"), str.isEmpty() ? Collections.singletonList("") : (List) DesugarArrays.stream(h.split(str)).filter(new n(0)).collect(Collectors.toUnmodifiableList()), str2, str3);
    }

    @Override // j$.nio.file.Path
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final o toAbsolutePath() {
        if (this.d) {
            return this;
        }
        String str = this.e;
        return new o(this.a, str, str, this.f).h(this);
    }

    @Override // j$.nio.file.Path
    public final H D(I i, F... fArr) {
        g(i, fArr, new G[0]);
        throw null;
    }

    @Override // j$.nio.file.Path
    public final boolean endsWith(String str) {
        return n(new o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final boolean equals(Object obj) {
        return (obj instanceof o) && compareTo((o) obj) == 0;
    }

    @Override // j$.nio.file.Path
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final o getName(int i) {
        if (i >= 0) {
            List list = this.c;
            if (i < list.size()) {
                return new o(this.a, (String) list.get(i), this.e, this.f);
            }
        }
        throw new IllegalArgumentException(String.format("Requested name for index (%d) is out of bound in \n%s.", Integer.valueOf(i), this));
    }

    @Override // j$.nio.file.Path
    public final H g(I i, F[] fArr, G... gArr) {
        throw new UnsupportedOperationException("Watch Service is not supported");
    }

    @Override // j$.nio.file.Path
    public final Path getFileName() {
        List list = this.c;
        if (list.isEmpty()) {
            if (this.d) {
                return null;
            }
            return this;
        }
        return new o(this.a, (String) list.get(list.size() - 1), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final FileSystem getFileSystem() {
        return this.a;
    }

    @Override // j$.nio.file.Path
    public final int getNameCount() {
        return this.c.size();
    }

    @Override // j$.nio.file.Path
    public final Path getRoot() {
        if (!this.d) {
            return null;
        }
        String str = this.f;
        return new o(this.a, str, this.e, str);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.Path
    public final Path i(j$.nio.file.k[] kVarArr) {
        FileSystem fileSystem = this.a;
        fileSystem.t().a(this, EnumC0003a.READ);
        return Arrays.asList(kVarArr).contains(j$.nio.file.k.NOFOLLOW_LINKS) ? toAbsolutePath() : new o(fileSystem, toFile().getCanonicalPath(), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final boolean isAbsolute() {
        return this.d;
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        return new j$.nio.file.o(this);
    }

    @Override // j$.nio.file.Path
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final o getParent() {
        List list = this.c;
        int size = list.size();
        if (size == 0) {
            return null;
        }
        boolean z = this.d;
        if (size == 1 && !z) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("/");
        }
        sb.append(g.M(list.subList(0, size - 1)));
        return new o(this.a, sb.toString(), this.e, this.f);
    }

    @Override // java.lang.Comparable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Path path) {
        return this.b.compareTo(((o) path).b);
    }

    @Override // j$.nio.file.Path
    public final boolean m(Path path) {
        int nameCount;
        path.getClass();
        if ((path instanceof o) && this.d == path.isAbsolute() && this.c.size() >= (nameCount = path.getNameCount())) {
            for (int i = 0; i < nameCount; i++) {
                if (getName(i).equals(path.getName(i))) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // j$.nio.file.Path
    public final boolean n(Path path) {
        path.getClass();
        if (!(path instanceof o)) {
            return false;
        }
        if (path.isAbsolute()) {
            return equals(path);
        }
        int nameCount = path.getNameCount();
        List list = this.c;
        if (list.size() < nameCount) {
            return false;
        }
        int size = list.size();
        for (int i = nameCount - 1; i >= 0; i--) {
            if (!getName((i - nameCount) + size).equals(path.getName(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.nio.file.Path
    public final Path normalize() {
        ArrayDeque arrayDeque = new ArrayDeque();
        for (String str : this.c) {
            str.getClass();
            if (!str.equals(".")) {
                if (str.equals("..")) {
                    arrayDeque.removeLast();
                } else {
                    arrayDeque.add(str);
                }
            }
        }
        return new o(this.a, (this.d ? "/" : "") + g.M(arrayDeque), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final o h(Path path) {
        if (!(path instanceof o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        if (((o) path).d) {
            return (o) path;
        }
        return new o(this.a, this.b + "/" + String.valueOf(path), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final Path resolve(String str) {
        return h(getFileSystem().getPath(str, new String[0]));
    }

    @Override // j$.nio.file.Path
    public final Path resolveSibling(String str) {
        return p(new o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final boolean startsWith(String str) {
        return m(new o(this.a, str, this.e, this.f));
    }

    @Override // j$.nio.file.Path
    public final Path subpath(int i, int i2) {
        return new o(this.a, g.M(this.c.subList(i, i2)), this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final Path t(Path path) {
        int i = 0;
        if (!(path instanceof o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        if (this.d != ((o) path).d) {
            throw new IllegalArgumentException("'other' is different type of Path in absolute property.");
        }
        List list = ((o) path).c;
        List list2 = this.c;
        int size = list2.size();
        int size2 = list.size();
        while (i < size && i < size2 && ((String) list2.get(i)).equals(list.get(i))) {
            i++;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = i; i2 < size; i2++) {
            arrayList.add("..");
        }
        while (i < size2) {
            arrayList.add((String) list.get(i));
            i++;
        }
        return new o(this.a, false, arrayList, this.e, this.f);
    }

    @Override // j$.nio.file.Path
    public final File toFile() {
        return new File(this.b);
    }

    @Override // j$.nio.file.Path
    public final String toString() {
        return this.b;
    }

    @Override // j$.nio.file.Path
    public final URI toUri() {
        char[] cArr = p.c;
        o absolutePath = toAbsolutePath();
        if (absolutePath.g == null) {
            absolutePath.g = absolutePath.b.getBytes(q.a);
        }
        byte[] bArr = absolutePath.g;
        StringBuilder sb = new StringBuilder("file:///");
        for (int i = 1; i < bArr.length; i++) {
            char c = (char) (bArr[i] & 255);
            long j = p.a;
            long j2 = p.b;
            if (c >= '@' ? c >= 128 || ((1 << (c - '@')) & j2) == 0 : (j & (1 << c)) == 0) {
                sb.append('%');
                char[] cArr2 = p.c;
                sb.append(cArr2[(c >> 4) & 15]);
                sb.append(cArr2[c & 15]);
            } else {
                sb.append(c);
            }
        }
        if (sb.charAt(sb.length() - 1) != '/' && toFile().isDirectory()) {
            sb.append('/');
        }
        try {
            return new URI(sb.toString());
        } catch (URISyntaxException e) {
            throw new AssertionError(e);
        }
    }

    @Override // j$.nio.file.Path
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final o p(Path path) {
        path.getClass();
        if (!(path instanceof o)) {
            throw new IllegalArgumentException(String.format("Expected to resolve paths on the same file system as DesugarUnixPath, but gets %s (%s).", path, path.getFileSystem()));
        }
        o parent = getParent();
        return parent == null ? (o) path : parent.h(path);
    }

    public o(FileSystem fileSystem, boolean z, List list, String str, String str2) {
        this.a = fileSystem;
        this.d = z;
        this.c = list;
        String str3 = z ? "/" : "";
        this.b = str3 + g.M(list);
        this.e = str;
        this.f = str2;
    }
}
