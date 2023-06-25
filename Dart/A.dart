// ignore_for_file: public_member_api_docs, sort_constructors_first
class A {
  String a;
  int b;
  bool status;
  A({
    required this.a,
    required this.b,
    required this.status,
  });

  @override
  bool operator ==(covariant A other) {
    if (identical(this, other)) return true;

    return other.a == a && other.b == b && other.status == status;
  }

  @override
  int get hashCode => a.hashCode ^ b.hashCode ^ status.hashCode;

  @override
  String toString() => 'A(a: $a, b: $b, status: $status)';
}

void main(List<String> args) {
  Map<String, List<A>> map = {};

  List<A> a = [
    A(a: 'MILK', b: 20, status: true),
    A(a: 'MILK 3', b: 30, status: true),
    A(a: 'MILK 5', b: 40, status: true),
  ];

  void addmap() {
    for (var i = 1; i < 4; i++) {
      map[i.toString()] = List.from(a);
    }
  }

  addmap();

  map.update('3', (value) {
    List<A> copy = [
      A(a: 'MILK', b: 20, status: false),
      A(a: 'MILK 3', b: 30, status: true),
      A(a: 'MILK 5', b: 40, status: true),
    ];
    // copy[0].status = false;
    value[0].status = copy[0].status;
    return value;
  });

  map.forEach((key, value) {
    print('$key = ${value[0].status}');
  });
}
